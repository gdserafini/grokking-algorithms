package br.pucpr.hashTable;

import br.pucpr.arrayList.ArrayList;
import br.pucpr.linkedList.LinkedList;

public class HashTable<T extends Comparable<T>> {

    private ArrayList<LinkedList<T>> table;
    private int size;
    private double loadFactor;
    private final double MAX_LOAD_FACTOR = 0.7;
    private int emptySlots;

    public HashTable(){
        this.size = 10;
        this.emptySlots = this.size;
        this.loadFactor = (this.size - this.emptySlots) / this.size;
        this.table = new ArrayList<LinkedList<T>>(size);

        for(int i = 0; i < this.size; i++){
            this.table.add(new LinkedList<T>());
        }
    }

    private int hash(String key){
        int valueLen = key.length();
        if(valueLen > this.size) return valueLen % this.size;
        return this.size % valueLen;
    }

    public void add(String key, T value){
        int index = hash(key);
        LinkedList<T> slot = this.table.get(index);
        if(slot.get() == null) {
            this.emptySlots--;
            this.loadFactor = (this.size - this.emptySlots) / this.size;
        }
        //if(this.loadFactor >= this.MAX_LOAD_FACTOR) resize();
        this.table.get(index).addWithKey(key, value);
    }

    //public void resize(){}

    public T getValue(String key){
        int index = hash(key);
        return this.table.get(index).getByKey(key);
    }

    public boolean contains(String key){
        int index = hash(key);
        return this.table.get(index).getByKey(key) != null;
    }
}
