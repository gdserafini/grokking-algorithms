package br.pucpr.selectionSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    public void testSelectionSort(){
        Integer[] numbers = {1,6,4,8,3,8};
        Integer[] sortedNumbers = {1,3,4,6,8,8};
        var selectionSort = new SelectionSort<Integer>();
        assertArrayEquals(sortedNumbers, selectionSort.sort(numbers));
    }
}
