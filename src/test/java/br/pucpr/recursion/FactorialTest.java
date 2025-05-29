package br.pucpr.recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calc(0), "0! should be 1");
    }

    @Test
    public void testFactorialOfPositiveInteger() {
        Factorial factorial = new Factorial();
        assertEquals(120, factorial.calc(5), "5! should be 120");
    }

    @Test
    public void testFactorialOfNegativeIntegerThrowsException() {
        Factorial factorial = new Factorial();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factorial.calc(-3);
        });
        assertEquals("Invalid value: -3", exception.getMessage());
    }

    @Test
    public void testFactorialTailOfZero() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calcTail(0), "0! should be 1");
    }

    @Test
    public void testFactorialTailOfPositiveInteger() {
        Factorial factorial = new Factorial();
        assertEquals(120, factorial.calcTail(5), "5! should be 120");
    }

    @Test
    public void testFactorialTailOfNegativeIntegerThrowsException() {
        Factorial factorial = new Factorial();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factorial.calcTail(-3);
        });
        assertEquals("Invalid value: -3", exception.getMessage());
    }
}
