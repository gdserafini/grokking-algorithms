package br.pucpr.recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void testFactorial() {
        var factorial = new Factorial();
        assertEquals(120, factorial.calc(5), "5! should be 120");
    }
}
