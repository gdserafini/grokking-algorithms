package br.pucpr.graph;

public class Graph{
    private HashTable<ArrayList<String>> graph;

    public Graph(){
        this.graph = new HashTable<ArrayList<String>>;
    }

    public void add(String node, ArrayList<String> neighboors){
        if(node == null || neighboors == null ||  neighboors.length == 0) return; 
        graph.add(node, neighboors);
    }

    public void add(String node, String newNeighboor){
        if(node == null || newNeighboor == null) return; 
        ArrayList<String> neighboors = graph.get(node);
        neighboors.add(newNeighboor);
    }

    public ArrayList<String> bfs(String start, String end){
        
    }
}
