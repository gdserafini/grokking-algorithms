package br.pucpr.search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private Integer[] numbers = {1,2,3,4,5,6,7,8,9};

    @Test
    public void testBinarySearchFindMid(){
        assertEquals(BinarySearch.search(numbers, 5), 4);
    }

    @Test
    public void testBinarySearchFindLow(){
        assertEquals(BinarySearch.search(numbers, 3), 2);
    }

    @Test
    public void testBinarySearchFindHigh(){
        assertEquals(BinarySearch.search(numbers, 7), 6);
    }

    @Test
    public void testBinarySearchNotFind(){
        assertEquals(BinarySearch.search(numbers, 10), -1);
    }

    @Test
    public void testBinarySearchStartOfList(){
        assertEquals(BinarySearch.search(numbers, 9), 8);
    }

    @Test
    public void testBinarySearchEndOfList(){
        assertEquals(BinarySearch.search(numbers, 1), 0);
    }
}
