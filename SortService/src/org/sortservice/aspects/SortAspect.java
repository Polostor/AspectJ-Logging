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
    
    @After("call(void org.sortservice.services.Sort.AddNumber(int[]))")
    public void afterAddingNumber(JoinPoint jp) {
        System.out.println(jp.getSignature().toShortString());
        System.out.println("Added  the array of numbers - array was " + Arrays.toString((int[]) jp.getArgs()[0]));
    }

    @AfterReturning(pointcut = "call(int[] org.sortservice.services.Sort.SortNumbers())", returning = "arr")
    public void afterSorting(JoinPoint jp, int[] arr) {
        System.out.println(jp.getSignature().toShortString());
        System.out.println("Sorted the array of numbers - array was " + Arrays.toString(arr));
    }
}
