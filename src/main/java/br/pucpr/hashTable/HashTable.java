package br.pucpr.hashTable;

import br.pucpr.arrayList.ArrayList;
import br.pucpr.linkedList.LinkedList;

public class HashTable<T extends Comparable<T>> {

    private ArrayList<LinkedList<T>> table;
    private int size;

    public HashTable(){
        this.size = 10;
        this.table = new ArrayList<LinkedList<T>>(size);

        for(int i = 0; i < this.size; i++){
            this.table.add(new LinkedList<T>());
        }
    }

    private int hash(T value){
        var stringValue = String.valueOf(value);
        int valueLen = stringValue.length();

        if(valueLen > this.size) return valueLen % this.size;
        return this.size % valueLen;
    }

    public void add(T value){
        int index = hash(value);
        this.table[index].add(value);
    }
}
