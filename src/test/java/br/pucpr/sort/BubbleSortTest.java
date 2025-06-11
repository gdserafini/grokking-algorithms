package br.pucpr.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSortUnsorted(){
        Integer[] numbers = {-1,-6,4,8,3,8};
        Integer[] sortedNumbers = {-6,-1,3,4,8,8};
        var bubbleSort = new BubbleSort<Integer>();
        assertArrayEquals(sortedNumbers, bubbleSort.sort(numbers));
    }

    @Test
    public void testBubbleSortSorted(){
        Integer[] sortedNumbers = {-1,-2,3,4,5};
        var bubbleSort = new BubbleSort<Integer>();
        assertArrayEquals(sortedNumbers, bubbleSort.sort(sortedNumbers));
    }

    @Test
    public void testBubbleSortReversed(){
        Integer[] sortedNumbers = {-2,-1,3,4,5};
        Integer[] reversedNumbers = {5,4,3,-1,-2};
        var bubbleSort = new BubbleSort<Integer>();
        assertArrayEquals(sortedNumbers, bubbleSort.sort(reversedNumbers));
    }

    @Test
    public void testBubbleSortEmpty(){
        Integer[] emptyNumbers = {};
        var bubbleSort = new BubbleSort<Integer>();
        assertArrayEquals(emptyNumbers, bubbleSort.sort(emptyNumbers));
    }
}
