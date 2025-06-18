package br.pucpr.hashTable;

import br.pucpr.arrayList.ArrayList;
import br.pucpr.linkedList.LinkedList;

public class HashTable<T extends Comparable<T>> {

    private ArrayList<LinkedList<T>> table;
    private int size;
    private double loadFactor;
    private final double MAX_LOAD_FACTOR = 0.7;
    private final int MULT_LOAD_FACTOR = 2;
    private final int HASH_CODE_MULT = 31;
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
        int hashCode = 0;
        for(int i = 0; i < key.length(); i++){
            hashCode = this.HASH_CODE_MULT * hashCode + key.charAt(i);
        }
        return Math.abs(hash) % this.size;
    }

    public void add(String key, T value){
        int index = hash(key);
        LinkedList<T> slot = this.table.get(index);
        if(slot.get() == null) {
            this.emptySlots--;
        }
        this.loadFactor = (this.size - this.emptySlots) / this.size;
        if(this.loadFactor >= this.MAX_LOAD_FACTOR){
            resize();
            return;
        }
        slot.addWithKey(key, value);
    }

    public void resize(){
        int oldSize = this.size;
        this.size = this.size * this.MULT_LOAD_FACTOR;
        this.emptySlots = this.size;
        this.loadFactor = (this.size - this.emptySlots) / this.size;
        ArrayList<LinkedList<T>> copy = this.table;
        this.table = new ArrayList<LinkedList<T>>(size);
        for(int i = 0; i < this.size; i++){
            this.table.add(new LinkedList<T>());
        }
        for(int i = 0; i < oldSize; i++){
            LinkedList<T> slot = copy.get(i);
            Node<T> currentNode = slot.get();
            while(currentNode != null){
                this.rehash(currentNode.getKey(), currentNode.getData());
                currentNode = currentNode.getNext();
            }
        }
        this.loadFactor = (this.size - this.emptySlots) / this.size;
    }

    private void rehash(String key, T value){
        int index = hash(key);
        LinkedList<T> slot = this.table.get(index);
        if(slot.get() == null) this.emptySlots--;
        this.table.get(index).addWithKey(key, value);
    }

    public T getValue(String key){
        int index = hash(key);
        return this.table.get(index).getByKey(key);
    }

    public boolean contains(String key){
        int index = hash(key);
        return this.table.get(index).getByKey(key) != null;
    }
}
