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
        if(!graph.contains(start) || !graph.contains(end)) return;
        var path = new LinkedList<String>;
        String current = start;
        while(true){
            LinkedList<String> neighboors = graph.get(current);
            for(int i = 0; i < neighboors.getSize(); i++){
                neighboor = neighboors.get(i)
                path.add(neighboor);
                if(neighboor == end) return path
            }
            current = current.getNext();
            if(current == null) return;
        }
    }
}
