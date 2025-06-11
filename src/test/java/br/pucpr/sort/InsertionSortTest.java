package br.pucpr.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {

    @Test
    public void testInsertionSortUnsorted(){
        Integer[] numbers = {-1,-6,4,8,3,8};
        Integer[] sortedNumbers = {-6,-1,3,4,8,8};
        var insertionSort = new InsertionSort<Integer>();
        assertArrayEquals(sortedNumbers, insertionSort.sort(numbers));
    }

    @Test
    public void testInsertionSortSorted(){
        Integer[] sortedNumbers = {-1,-2,3,4,5};
        var insertionSort = new InsertionSort<Integer>();
        assertArrayEquals(sortedNumbers, insertionSort.sort(sortedNumbers));
    }

    @Test
    public void testInsertionSortReversed(){
        Integer[] sortedNumbers = {-2,-1,3,4,5};
        Integer[] reversedNumbers = {5,4,3,-1,-2};
        var insertionSort = new InsertionSort<Integer>();
        assertArrayEquals(sortedNumbers, insertionSort.sort(reversedNumbers));
    }

    @Test
    public void testInsertionSortEmpty(){
        Integer[] emptyNumbers = {};
        var insertionSort = new InsertionSort<Integer>();
        assertArrayEquals(emptyNumbers, insertionSort.sort(emptyNumbers));
    }
}
