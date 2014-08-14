package org.sortservice.aspects;

import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author peta
 */
@Aspect
public class CacheAspect {

    private Map<String, Object> cache;

    public CacheAspect() {
        cache = new HashMap<String, Object>();
    }

    @Pointcut("execution(@Cacheable * *.*(..))")
    @SuppressWarnings("unused")
    private void cache() {}

    @Around("cache()")
    public Object aroundCachedMethods(ProceedingJoinPoint pjp) throws Throwable {
        StringBuilder keyBuff = new StringBuilder();

        for (final Object arg : pjp.getArgs()) {
            keyBuff.append(arg.getClass().getSimpleName() + "=" + arg + ";");
        }
        String key = keyBuff.toString();

        System.out.print(key);
        Object result = cache.get(key);
        if (result == null) {
            result = pjp.proceed();
            System.out.println(" = " + result + "; cache miss");
            cache.put(key, result);
        } else {
            System.out.println(" = " + result + "; cache hit");
        }

        return result;
    }

}
