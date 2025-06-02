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

}
