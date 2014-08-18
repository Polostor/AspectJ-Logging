package org.sortservice.start;

import org.sortservice.services.Count;
import org.sortservice.services.Sort;

/**
 *
 * @author peta
 */
public class Start {
    
    public static void main(String[] args) {
        Sort sortMe = new Sort();    
        
        int[] number = {1,3,5,2,4};        
        sortMe.addNumber(number);  
        
        sortMe.sortNumbers();
        
        System.out.println("------------------------------------");
        
        Count c = new Count();
        // cache miss
        c.Sum(1, 2);
        // cache hit
        c.Sum(1, 2);
        
    }

}
