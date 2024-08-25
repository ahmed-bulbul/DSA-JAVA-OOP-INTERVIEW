package dsa.graph;

public class GraphMain {

    public static void main(String[] args) {
        /*GraphUsingEdgeList g = new GraphUsingEdgeList(4);

        g.addEdge(0, 1, 10);
        g.addEdge(0, 2, 20);
        g.addEdge(1, 2, 30);
        g.addEdge(2, 0, 40);
        g.addEdge(2, 3, 50);
        g.addEdge(3, 3, 60);

        System.out.println(g);*/

      /*  GraphUsingAdjMatrix g = new GraphUsingAdjMatrix(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println(g);*/

        Graph g = new Graph(7);
        g.addEdge(0,1, true);
        g.addEdge(0, 2, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 6, true);
        g.addEdge(2, 4, true);
        g.addEdge(4, 6, true);
        g.addEdge(1, 4, true);
        g.addEdge(4, 5, true);
        System.out.println(g);

        g.BFS(0);

    }
}
