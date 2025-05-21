package br.pucpr.linkedList;

public class LinkedList<T> {
    private DataNode<T> top;
    private DataNode<T> botton;
    private int size;

    public LinkedList(){
        this.top = null;
        this.botton = null;
        this.size = 0;
    }

    public void add(T data){
        var newNode = new DataNode<T>(data);

        if(top == null && botton == null){
            this.top = newNode;
            this.botton = newNode;
            this.size++;
            return;
        }

        this.top.setNext(newNode);
        newNode.setPrevious(top);
        this.top = newNode;
        this.size++;
    }

    public void print(){
        DataNode<T> currentNode = this.botton;

        for(int i = 0; i <= size; i++){
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
    }
}
