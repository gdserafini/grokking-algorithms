package br.pucpr.graph;

public class Graph{
    private HashTable<LinkedList<String>> graph;

    public Graph(){
        this.graph = new HashTable<LinkedList<String>>;
    }

    public void add(String node, LinkedList<String> neighbors){
        if(
            node == null || graph.contains(node) ||
            neighbors == null || neighbors.getSize() == 0
        ) return; 
        graph.add(node, neighbors);
    }

    public void add(String node, String newNeighbor){
        if(
            node == null || !graph.contains(node) ||
            newNeighbor == null
        ) return; 
        LinkedList<String> neighbors = graph.get(node);
        if(neighbors.contains(newNeighbor)) return;
        neighboors.add(newNeighbor);
    }

    public LinkedList<String> bfs(String start, String end){
        
    }
}
