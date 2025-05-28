package br.pucpr.selectionSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    public void testSelectionSortUnsorted(){
        Integer[] numbers = {-1,-6,4,8,3,8};
        Integer[] sortedNumbers = {-6,-1,3,4,8,8};
        var selectionSort = new SelectionSort<Integer>();
        assertArrayEquals(sortedNumbers, selectionSort.sort(numbers));
    }

    @Test
    public void testSelectionSortSorted(){
        Integer[] sortedNumbers = {-1,-2,3,4,5};
        var selectionSort = new SelectionSort<Integer>();
        assertArrayEquals(sortedNumbers, selectionSort.sort(sortedNumbers));
    }

    @Test
    public void testSelectionSortReversed(){
        Integer[] sortedNumbers = {-2,-1,3,4,5};
        Integer[] reversedNumbers = {5,4,3,-1,-2};
        var selectionSort = new SelectionSort<Integer>();
        assertArrayEquals(sortedNumbers, selectionSort.sort(reversedNumbers));
    }

    @Test
    public void testSelectionSortEmpty(){
        Integer[] emptyNumbers = {};
        var selectionSort = new SelectionSort<Integer>();
        assertArrayEquals(emptyNumbers, selectionSort.sort(emptyNumbers));
    }
}
