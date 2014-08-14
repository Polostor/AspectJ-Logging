package org.sortservice.start;

import org.sortservice.services.Sort;

/**
 *
 * @author peta
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sort sortMe = new Sort();        
        sortMe.SortNumbers();
        int[] number = {1,3,5,2,4};
        sortMe.AddNumber(number);    
        sortMe.SortNumbers();
    }

}
