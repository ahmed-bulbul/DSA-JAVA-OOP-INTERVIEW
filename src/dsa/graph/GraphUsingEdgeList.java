package dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Edge{
    int u;
    int v;
    int w;

    Edge(int u, int v, int w){
        this.u = u;
        this.v = v;
        this.w = w;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "u=" + u +
                ", v=" + v +
                ", w=" + w +
                '}';
    }
}

public class GraphUsingEdgeList {
    int V;
    List<Edge> l;

    GraphUsingEdgeList(int V){
        this.V = V;
        l = new LinkedList<>();
    }

    void addEdge(int u, int v, int w){
        l.add(new Edge(u, v, w));
    }

    void display(){
        for(Edge e : l){
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "GraphUsingEdgeList{" +
                "V=" + V +
                ", l=" + l +
                '}';
    }
}
