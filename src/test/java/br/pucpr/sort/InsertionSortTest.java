package br.pucpr.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {

    @Test
    public void testInsertionSort(){
        Integer[] numbers = {-1,-6,4,8,3,8};
        Integer[] sortedNumbers = {-6,-1,3,4,8,8};
        var insertionSort = new InsertionSort<Integer>();
        assertArrayEquals(sortedNumbers, insertionSort.sort(numbers));
    }

}
