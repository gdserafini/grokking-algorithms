package br.pucpr.euclid;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.javatuples.Pair;
import org.junit.jupiter.api.Test;

public class EuclidTest {

    @Test
    public void testGetMaxSides(){
        var euclid = new Euclid();
        Pair<Integer, Integer> sides = euclid.getMaxSides(640, 1680);
        assertEquals(new Pair<>(80, 80), sides);
    }

    @Test
    public void testGetGCD(){
        var euclid = new Euclid();
        assertEquals(80, euclid.getGCD(1680, 640));
    }

}
