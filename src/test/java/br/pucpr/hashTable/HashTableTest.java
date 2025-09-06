package br.pucpr.hashTable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HashTableTest {

    @Test
    public void testAdd(){
        var table = new HashTable<String, Integer>();
        table.add("one", 1);
        table.add("two", 2);
        table.add("three", 3);           
        assertEquals(2, table.getValue("two"));
    }

    @Test
    public void testContains(){
        var table = new HashTable<String, Integer>();
        table.add("one", 1);
        table.add("two", 2);
        table.add("three", 3);           
        assertEquals(true, table.contains("two"));
    }
}
