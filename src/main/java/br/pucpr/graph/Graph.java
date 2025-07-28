package br.pucpr.graph;

public class Graph{
    private HashTable<ArrayList<String>> graph;

    public Graph(){
        this.graph = new HashTable<ArrayList<String>>;
    }

    public void add(String node, ArrayList<String> neighboors){
        graph.add(node, neighboors);
    }

    public ArrayList<String> bfs(String start, String end){
        
    }
}
