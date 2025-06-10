package br.pucpr.arrayList;

import java.util.Arrays;

public class ArrayList<T> {
    private Object[] values;
    private int size;
    private int lastEmptyIndex;
    private final int INIT_SIZE = 10;
    private final int INCREASE_FACTOR = 2;

    public ArrayList(int size){
        if(size <= 0) {
            throw new IllegalArgumentException("Invalid size: " + size);
        }
        this.size = size;
        this.values = new Object[this.size];
        this.lastEmptyIndex = 0;
    }
    
    public ArrayList(){
        this.values = new Object[this.INIT_SIZE];
        this.size = this.INIT_SIZE;
        this.lastEmptyIndex = 0;
    }

    public void add(T data){
        if(lastEmptyIndex >= this.size){
            this.size = this.size * this.INCREASE_FACTOR;
            this.values = Arrays.copyOf(this.values, this.size);
        }
        
        this.values[lastEmptyIndex] = data;
        this.lastEmptyIndex++;
    }

    public void add(T data, int index){
        validateIndex(index);
        
        while(index >= this.size){
            this.size = this.size * this.INCREASE_FACTOR;
            this.values = Arrays.copyOf(this.values, this.size);
        }

        this.values[index] = data;
        setLastEmptyIndex();
    }

    private void setLastEmptyIndex(){
        for(int i = 0; i < this.values.length; i++){
            if(this.values[i] == null) {
                this.lastEmptyIndex = i;
                return;
            }
        }
    }

    public int getSize(){ return this.size; }

    @SuppressWarnings("unchecked")
    public T get(int index){
        validateIndex(index);
        return (T) this.values[index];
    }

    public void remove(int index){
        validateIndex(index);
        this.values[index] = null;
        setLastEmptyIndex();
    }

    public void remove(){
        for(int i = this.size - 1; i >= 0; i--){
            if(this.values[i] != null){
                this.values[i] = null;
                this.lastEmptyIndex = i;
                return;
            }
        }
    }

    public void set(T data, int index){ add(data, index); }

    private void validateIndex(int index){
        if(index < 0 || index >= this.size){
            throw new IllegalArgumentException("Invalid index: " + index);   
        }
    }
}
