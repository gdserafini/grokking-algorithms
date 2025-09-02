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

    public LinkedList<String> bfs(String start, String end){
        if(
            start == null || end == null ||
            !graph.contains(start) || !graph.contains(end)
        ) return;
        var path = new LinkedList<String>();
        var list = new LinkedList<String>();
        path.add(start);
        LinkedList<String> neighbors = graph.get(start);
        //TODO -> Implement append method
        //list.append(neighbors);
        while(true){
            for(int i = 0; i < list.getSize(); i++){
                neighbor = list.get(i);
                if(neighbor.equals(end){
                    path.add(neighbor);
                    return path;
                }
                else{
                    path.add(neighbor);
                    LinkedList<String> nextNeighbors = graph.get(neighbor);
                    if(neighbor == null || nextNeighbors == null) return null;
                    //TODO -> Implement append method
                    //list.append(nextNeighbors);
                }
            }
        }
    }
}
