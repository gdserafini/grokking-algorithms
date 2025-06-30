package br.pucpr.search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    
    @Test
    public void testBinarySearchFindMid(){
        private Integer[] numbers = {1,2,3,4,5,6,7,8,9};
        assertEquals(BinarySearch.search(numbers, 7), 6);
    }
}
