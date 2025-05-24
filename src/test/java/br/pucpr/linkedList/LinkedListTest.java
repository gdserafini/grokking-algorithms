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
        numbers.print(); //Ok
    }

    @Test
    public void testAddElementLinkedListAtIndex(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4, 1);
        numbers.print(); //Ok
    }

    @Test 
    public void testDeleteElementLinkedList(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.delete();
        numbers.print(); //Ok
    }

    @Test 
    public void testDeleteElementLinkedListAtIndex(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.delete(1);
        numbers.print(); //Ok
    }

    @Test 
    public void testDeleteElementLinkedListByData(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.deleteByData(2);
        numbers.print(); //Ok
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

    @Test
    public void testUpdateLinkedListAtIndex(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.update(4, 1);
        numbers.print();
    }

    @Test
    public void testUpdateLinkedListByData(){
        var numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.updateByData(4, 2);
        numbers.print();
    }
}
