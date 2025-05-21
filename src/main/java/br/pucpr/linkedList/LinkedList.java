package br.pucpr.linkedList;

public class LinkedList<T> {
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
            this.tail = newNode;
            this.head = newNode;
            this.size++;
            return;
        }

        this.tail.setNext(newNode);
        newNode.setPrevious(this.tail);
        this.tail = newNode;
        this.size++;
    }

    public void add(T data, int index){
        if(index > this.size || index < 0) return;

        var newNode = new DataNode<T>(data);
        
        if(this.size == 0) this.add(data);

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

    public void print(){
        DataNode<T> currentNode = this.head;

        while(currentNode != null){
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
    }
}
