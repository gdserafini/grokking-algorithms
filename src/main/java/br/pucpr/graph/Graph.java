package br.pucpr.graph;

public class Graph{
    private HashTable<LinkedList<String>> graph;

    public Graph(){
        this.graph = new HashTable<LinkedList<String>>;
    }

    public void add(String node, LinkedList<String> neighboors){
        if(
            node == null || 
            neighboors == null || neighboors.getSize() == 0
        ) return; 
        graph.add(node, neighboors);
    }

    public void add(String node, String newNeighboor){
        if(
            node == null || !graph.contains(node) ||
            newNeighboor == null
        ) return; 
        LinkedList<String> neighboors = graph.get(node);
        neighboors.add(newNeighboor);
    }

    public LinkedList<String> bfs(String start, String end){
        
    }
}
