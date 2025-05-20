package br.pucpr.linkedList;

public class DataNode<T> {
    private T data;
    DataNode<T> previous, next;

    public DataNode(){}

    public DataNode(T data){
        this.data = data;
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    public void setPrevious(DataNode<T> node){
        this.previous = node;
    }

    public DataNode<T> getPrevious(){
        return this.previous;
    }

    public void setNext(DataNode<T> node){
        this.next = node;
    }

    public DataNode<T> getNext(){
        return this.next;
    }
}
