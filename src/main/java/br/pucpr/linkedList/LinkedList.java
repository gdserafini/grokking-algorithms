package br.pucpr.linkedList;

public class LinkedList<T extends Comparable<T>> {
    private DataNode<T> tail;
    private DataNode<T> head;
    private int size;

    public LinkedList(){
        this.tail = null;
        this.head = null;
        this.size = 0;
    }

    public void add(T data){
        var newNode = new DataNode<T>(data);

        if(this.size == 0){
            this.addFirstElement(newNode);
            return;
        }

        this.tail.setNext(newNode);
        newNode.setPrevious(this.tail);
        this.tail = newNode;
        this.size++;
    }

    public void addWithKey(String key, T data){
        var newNode = new DataNode<T>(key, data);

        if(this.size == 0){
            this.addFirstElement(newNode);
            return;
        }

        this.tail.setNext(newNode);
        newNode.setPrevious(this.tail);
        this.tail = newNode;
        this.size++;
    }

    public void add(T data, int index){
        this.checkIndex(index);

        var newNode = new DataNode<T>(data);
        
        if(this.size == 0){
            this.addFirstElement(newNode);
            return;
        };

        if(index == 0){
            this.head.setPrevious(newNode);
            newNode.setNext(this.head);
            this.head = newNode;
            this.size++;
            return;
        }
        if(index == this.size){
            this.tail.setNext(newNode);
            newNode.setPrevious(this.tail);
            this.tail = newNode;
            this.size++;
            return;
        }

        DataNode<T> currentNode = this.head;
        
        for(int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        }

        DataNode<T> previous = currentNode.getPrevious();
        
        previous.setNext(newNode);
        currentNode.setPrevious(newNode);
        newNode.setPrevious(previous);
        newNode.setNext(currentNode);
        this.size++;
    }

    public DataNode<T> search(int index){
        this.checkIndex(index);

        DataNode<T> currentNode = this.head;

        for(int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    public T get(){ return this.tail.getData(); }

    public T get(int index){
        this.checkIndex(index);
        return this.search(index).getData();
    }

    public T getByKey(String key){
        DataNode<T> currentNode = this.head;

        for(int i = 0; i < this.size; i++){
            if(currentNode.getKey().equals(key)) return currentNode.getData();
            currentNode = currentNode.getNext();
        }

        return null;
    }

    public boolean contains(T data){
        int index = this.getIndex(data);
        return index != -1;
    }

    public int getIndex(T data){
        DataNode<T> currentNode = this.head;
        
        for(int i = 0; i < this.size; i++){
            if(currentNode.getData().compareTo(data) == 0) return i;
            currentNode = currentNode.getNext();
        }

        return -1;
    }

    public void update(T newData, int index){
        this.checkIndex(index);
        
        DataNode<T> node = this.search(index);
        node.setData(newData);
    }

    public void updateByData(T newData, T data){
        int index = this.getIndex(data);
        this.checkIndex(index);
        
        DataNode<T> node = this.search(index);
        node.setData(newData);
    }

    public void delete(){
        if(this.size == 0) return;

        DataNode<T> previous = this.tail.getPrevious();
        previous.setNext(null);
        this.tail = previous;
    }

    public void deleteByData(T data){
        int index = this.getIndex(data);
        this.delete(index);
    }

    public void delete(int index){
        this.checkIndex(index);

        DataNode<T> currentNode = this.head;

        if((index == 0 || index == this.size - 1) && this.size == 1) {
            this.head = this.tail = null;
            this.size--;
            return;
        }
        if(index == 0) {
            currentNode = currentNode.getNext();
            this.head = currentNode;
            this.head.setPrevious(null);
            this.size--;
            return;
        }
        if(index == size - 1){
            currentNode = this.tail.getPrevious();
            this.tail = currentNode;
            this.tail.setNext(null);
            this.size--;
            return;
        }

        for(int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        }

        DataNode<T> next = currentNode.getNext();
        DataNode<T> previous = currentNode.getPrevious();
        
        if(next != null && previous != null) {
            next.setPrevious(previous);
            previous.setNext(next); 
        }

        currentNode = null;
        this.size--;
    }

    public void print(){
        DataNode<T> currentNode = this.head;

        while(currentNode != null){
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }

        System.out.println();
    }

    private void addFirstElement(DataNode<T> newNode){
        this.tail = newNode;
        this.head = newNode;
        this.size++;
    }

    private void checkIndex(int index){
        if(index >= this.size || index < 0){
            throw new IndexOutOfBoundsException("Invalid index: " + index);  
        }
    }
}
