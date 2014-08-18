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

    public void addNumber(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] sortNumbers() {
        if(numbers != null) sortItOut();
        return numbers;
    }

    private void sortItOut() {
        Arrays.sort(numbers);
    }
}
