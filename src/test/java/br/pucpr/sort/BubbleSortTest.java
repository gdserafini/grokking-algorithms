package br.pucpr.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSort(){
        Integer[] numbers = {-1,-6,4,8,3,8};
        Integer[] sortedNumbers = {-6,-1,3,4,8,8};
        var bubbleSort = new BubbleSort<Integer>();
        assertArrayEquals(sortedNumbers, bubbleSort.sort(numbers));
    }

}
