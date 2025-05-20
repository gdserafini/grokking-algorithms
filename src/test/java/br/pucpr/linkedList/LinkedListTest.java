package br.pucpr.linkedList;

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

}
