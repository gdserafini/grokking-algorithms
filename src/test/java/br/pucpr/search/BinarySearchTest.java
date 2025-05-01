package br.pucpr.search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private Integer[] numbers = {1,2,3,4,5,6,7,8,9};
    private int TARGET_MID = 5;
    private int TARGET_LOW = 3;
    private int TARGET_HIGH = 7;

    @Test
    public void testBinarySearchFindMid(){
        assertEquals(BinarySearch.search(numbers, TARGET_MID), 4);
    }

    @Test
    public void testBinarySearchFindLow(){
        assertEquals(BinarySearch.search(numbers, TARGET_LOW), 2);
    }

    @Test
    public void testBinarySearchFindHigh(){
        assertEquals(BinarySearch.search(numbers, TARGET_HIGH), 6);
    }

    @Test
    public void testBinarySearchNotFind(){
        assertEquals(BinarySearch.search(numbers, 10), -1);
    }
}
