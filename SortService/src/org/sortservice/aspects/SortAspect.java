package org.sortservice.aspects;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author peta
 */
@Aspect
public class SortAspect {
    
    @After("execute(void org.sortservice.services.Sort.addNumber(int[]))")
    public void afterAddingNumber(JoinPoint jp) {
        System.out.print(jp.getSignature().toShortString());
        System.out.println(" - " + Arrays.toString((int[]) jp.getArgs()[0]));
    }

    @AfterReturning(pointcut = "execute(int[] org.sortservice.services.Sort.sortNumbers())", returning = "arr")
    public void afterSorting(JoinPoint jp, int[] arr) {
        System.out.print(jp.getSignature().toShortString());
        System.out.println(" - " + Arrays.toString(arr));
    }
}
