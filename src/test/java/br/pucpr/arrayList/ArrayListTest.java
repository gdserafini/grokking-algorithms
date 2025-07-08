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

    @Test
    public void testGetByIndex(){
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        assertEquals(2, list.get(1));
    }

    @Test
    public void testRemoveByIndex(){
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.remove(1);
        assertEquals(null, list.get(1));
    }

    @Test
    public void testRemove(){
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.remove();
        assertEquals(null, list.get(1));
    }

    @Test
    public void testSetByIndex(){
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.set(3, 1);
        assertEquals(3, list.get(1));
    }
}
