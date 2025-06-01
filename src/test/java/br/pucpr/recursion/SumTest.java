package br.pucpr.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumTest {

    @Test
    public void testRecursiveSum(){
        var sum = new Sum();
        int[] numbers = {2,4,6};
        assertEquals(12, sum.calc(numbers, 0, 2));
    }

}
