package br.pucpr.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    public void testRecursiveSum(){
        var math = new Math();
        int[] numbers = {2,4,6};
        assertEquals(12, math.sum(numbers, 0, 2));
    }

    @Test
    public void testRecursiveSizeCount(){
        var math = new Math();
        int[] numbers = {2,4,6};
        assertEquals(3, math.size(numbers, 0, 2));
    }

    @Test
    public void testRecursiveMaxValue(){
        var math = new Math();
        int[] numbers = {2,6,4};
        assertEquals(6, math.max(numbers, 0, numbers[0]));
    }

}
