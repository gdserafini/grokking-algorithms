package br.pucpr.linkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void testAddElementLinkedList(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        assertEquals(1, numbers.get(0));
        assertEquals(2, numbers.get(1));
        assertEquals(3, numbers.get(2));
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
    public void testGetLinkedList(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        assertEquals(numbers.get(1), 2);
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
}
