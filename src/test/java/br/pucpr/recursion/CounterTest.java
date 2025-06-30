package br.pucpr.recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest {

    @Test
    public void testCounter(){
        var counter = new Counter();
        assertEquals(counter.count(10), 0);
    }
}
