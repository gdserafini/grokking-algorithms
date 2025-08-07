package br.pucpr.graph;

public class Graph{
    private HashTable<LinkedList<String>> graph;

    public Graph(){
        this.graph = new HashTable<LinkedList<String>>();
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
        neighbors.add(newNeighbor);
    }

    public LinkedList<String> bfs(String start, String end){
        if(
            start == null || end == null ||
            !graph.contains(start) || !graph.contains(end)
        ) return;
        var path = new LinkedList<String>();
        var list = new LinkedList<String>();
        String current = start;
        while(true){
            LinkedList<String> neighbors = graph.get(start);
            for(int i = 0; i < neighbors.getSize(); i++){
                if(current.equals(end)){
                    path.add(current);
                    return path;
                }
                else{
                    String next = neighbors.get(i)
                    LinkedList<String> nextNeighbors = graph.get(next);
                    //TODO -> Implement append method
                    //neighbors.append(nextNeighbors);
                    current = next;
                }
            }
            return null;
        }
    }
}
