package br.pucpr.arrayList;

public class ArrayList<T extends Comparable<T>> {
    private Object[] values;
    private int size;
    private int lastEmptyIndex;
    private final int INIT_SIZE = 10;
    private final double INCREASE_FACTOR = 1.5;

    public ArrayList(int size){
        if(size <= 0) throw new IllegalArgumentException("Invalid size: " + size);
        this.size = size;
        this.values = new Object[this.size];
    }
    
    public ArrayList(){
        this.values = new Object[this.INIT_SIZE];
        this.size = this.INIT_SIZE;
        this.lastEmptyIndex = 0;
    }

    public void add(T data){
        if(lastEmptyIndex >= this.size){
            this.size = (int) (this.size * this.INCREASE_FACTOR);
            this.copyArray();
            setLastEmptyIndex();
            return;
        }
        
        this.values[lastEmptyIndex] = data;
        this.lastEmptyIndex++;
    }

    public void add(T data, int index){
        validateIndex(index);
        
        while(index >= this.size){
            this.size = (int) (this.size * this.INCREASE_FACTOR);
        }

        copyArray();
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

    private void copyArray(){
        Object[] oldArray = this.values;
        this.values = new Object[this.size];

        for(int i = 0; i < oldArray.length; i++){
            this.values[i] = oldArray[i];
        }
    }

    public int getSize(){ return this.size; }

    public T get(int index){
        validateIndex(index);
        return (T) this.values[index];
    }

    public void remove(int index){
        validateIndex(index);
        this.values[index] = null;
        setLastEmptyIndex();
    }

    public void set(T data, int index){ add(data, index); }

    private void validateIndex(int index){
        if(index < 0 || index >= this.lastEmptyIndex){
            throw new IllegalArgumentException("Invalid index: " + index);   
        }
    }
}
