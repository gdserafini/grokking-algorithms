package br.pucpr.hashTable;

import br.pucpr.DataNode;
import br.pucpr.arrayList.ArrayList;
import br.pucpr.linkedList.LinkedList;

public class HashTable
    <K extends Comparable<K>, V extends Comparable<V>> 
{
    private ArrayList<LinkedList<V>> table;
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
        this.table = new ArrayList<LinkedList<V>>(size);
        this.initEmptyTable(this.size);
    }

    private void initEmptyTable(int tableSize){
        for(int i = 0; i < tableSize; i++){
            this.table.add(new LinkedList<V>());
        }
    }

    private int hash(String key){
        int hashCode = 0;
        for(int i = 0; i < key.length(); i++){
            hashCode = this.HASH_CODE_MULT * hashCode + key.charAt(i);
        }
        return Math.abs(hashCode) % this.size;
    }

    public void add(K key, V value){
        int index = hash(String.valueOf(key));
        LinkedList<V> slot = this.table.get(index);
        if(slot.isEmpty()) this.emptySlots--;
        this.loadFactor = (this.size - this.emptySlots) / this.size;
        if(this.loadFactor >= this.MAX_LOAD_FACTOR){
            resize();
            return;
        }
        slot.addWithKey(String.valueOf(key), value);
    }

    private void resize(){
        int oldSize = this.size;
        this.size = this.size * this.MULT_LOAD_FACTOR;
        this.emptySlots = this.size;
        this.loadFactor = (this.size - this.emptySlots) / this.size;
        ArrayList<LinkedList<V>> copy = this.table;
        this.table = new ArrayList<LinkedList<V>>(size);
        for(int i = 0; i < this.size; i++){
            this.table.add(new LinkedList<V>());
        }
        for(int i = 0; i < oldSize; i++){
            LinkedList<V> slot = copy.get(i);
            DataNode<V> currentNode = slot.getNode();
            while(currentNode != null){
                this.rehash(currentNode.getKey(), currentNode.getData());
                currentNode = currentNode.getNext();
            }
        }
        this.loadFactor = (this.size - this.emptySlots) / this.size;
    }

    private void rehash(String key, V value){
        int index = hash(key);
        LinkedList<V> slot = this.table.get(index);
        if(slot.get() == null) this.emptySlots--;
        this.table.get(index).addWithKey(key, value);
    }

    public V getValue(K key){
        int index = hash(String.valueOf(key));
        return this.table.get(index).getByKey(String.valueOf(key));
    }

    public boolean contains(K key){
        int index = hash(String.valueOf(key));
        return this.table.get(index).getByKey(String.valueOf(key)) != null;
    }
}
