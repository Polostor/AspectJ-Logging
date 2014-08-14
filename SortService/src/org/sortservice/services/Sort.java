package org.sortservice.services;

import java.util.Arrays;

/**
 *
 * @author peta
 */
public class Sort {

    private int[] numbers = null;

    public Sort() {
    }

    public void AddNumber(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] SortNumbers() {
        if(numbers != null) SortItOut();
        return numbers;
    }

    private void SortItOut() {
        Arrays.sort(numbers);
    }
}
