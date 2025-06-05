package br.pucpr.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

    @Test
    public void testSortArray(){
        Integer[] numbers = {1,6,3,7,9,2,10};
        Integer[] sortedNumbers = {1,2,3,6,7,9,10};
        var quicksort = new QuickSort<Integer>();
        assertArrayEquals(sortedNumbers, quicksort.sort(numbers));
    }

}
