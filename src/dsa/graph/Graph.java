package dsa.graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    int V;
    List<Integer> adjList[];

    Graph(int V){
        this.V = V;
        adjList = new LinkedList[V];
        for(int i=0;i<V;i++){
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v, boolean undirected){
        adjList[u].add(v);
        if (undirected){
            adjList[v].add(u);
        }
    }

    void BFS(int src){
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(src);
        visited[src] = true;

        while (!queue.isEmpty()){
            int node = queue.removeFirst();

            System.out.println(node);

            Iterator<Integer> it = adjList[node].listIterator();
            while (it.hasNext()){
                int nbr = it.next();
                if (!visited[nbr]){
                    visited[nbr] = true;
                    queue.addLast(nbr);
                }
            }
        }

    }


    @Override
    public String toString() {
        return "Graph{" +
                "V=" + V +
                ", adjList=" + Arrays.deepToString(adjList) +
                '}';
    }
}
