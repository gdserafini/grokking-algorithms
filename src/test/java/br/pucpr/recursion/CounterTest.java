package br.pucpr.recursion;

import org.junit.jupiter.api.Test;

public class CounterTest {

    @Test
    public void testCounter(){
        var counter = new Counter();
        counter.count(10);
    }
}
