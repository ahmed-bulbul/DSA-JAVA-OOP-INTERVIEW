package dsa.graph;

import java.util.Arrays;

public class GraphUsingAdjMatrix {

    int V;
    boolean adjMatrix[][];

    GraphUsingAdjMatrix(int V){
        this.V = V;
        adjMatrix = new boolean[V][V];
    }


    //undirected graph
    void addEdge(int u,int v){
        adjMatrix[u][v] = true;
        adjMatrix[v][u] = true;
    }

    @Override
    public String toString() {
        return "GraphUsingAdjMatrix{" +
                "V=" + V +
                ", adjMatrix=" + Arrays.deepToString(adjMatrix) +
                '}';
    }
}
