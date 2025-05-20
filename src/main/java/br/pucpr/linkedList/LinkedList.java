package br.pucpr.linkedList;

public class LinkedList<T> {
    private DataNode<T> top = null;
    private DataNode<T> botton = null;
    private int size = 0;

    public LinkedList(){}

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
        var currentNode = this.botton;

        while(true){
            if(currentNode == null) break;
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }
}
