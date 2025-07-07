package br.pucpr.arrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayListTest {

    @Test
    public void testAdd(){
        var list = new ArrayList<Integer>();
        list.add(1);
        assertEquals(1, list.get());
    }

    @Test
    public void testAddAtIndex(){
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2, 0);
        assertEquals(2, list.get(0));
    }
}
