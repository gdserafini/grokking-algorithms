package br.pucpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testHelloWorldMessage(){
        assertEquals(Main.getHelloWorldMessage(), "Hello world!");
    }
}
