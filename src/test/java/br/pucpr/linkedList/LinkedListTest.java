package br.pucpr.linkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void testAddElementLinkedList(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        assertEquals(1, numbers.get(0));
        assertEquals(2, numbers.get(1));
    }

    @Test
    public void testAddAtIndex(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3, 1);
        assertEquals(1, numbers.get(0));
        assertEquals(3, numbers.get(1));
    }

    @Test
    public void testAddWithKey(){
        var numbers = new LinkedList<Integer>();
        numbers.add("One", 1);
        numbers.add("Two", 2);
        assertEquals(1, numbers.getByKey("One"));
        assertEquals(2, numbers.getByKey("Two"));
    }

    @Test
    public void testSearchLinkedList(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        assertEquals(numbers.search(1).getData(), 2);
    }

    @Test
    public void testContainsLinkedList(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        assertEquals(numbers.contains(2), true);
    }

    @Test
    public void testGetIndexLinkedList(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        assertEquals(numbers.getIndex(2), 1);
    }

    @Test
    public void testUpdate(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.update(3, 1)
        assertEquals(numbers.get(1), 3);
    }

    @Test
    public void testUpdateByData(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.updateByData(3, 2)
        assertEquals(numbers.get(1), 3);
    }

    @Test
    public void testDeleteLast(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.delete();
        assertEquals(numbers.get(1), null);
    }

    @Test
    public void testDeleteByIndex(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.delete(1);
        assertEquals(numbers.get(1), null);
    }

    @Test
    public void testDeleteByData(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.deleteByData(2);
        assertEquals(numbers.get(1), null);
    }
}
