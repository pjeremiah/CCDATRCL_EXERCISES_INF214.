public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 11;
        int noEdges = 11;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "Jeremiah";
        myGraph.edge[0].dest = "Ericka";

        // Edge 2
        myGraph.edge[1].src = "Jeremiah";
        myGraph.edge[1].dest = "Frankie";

        // Edge 3
        myGraph.edge[2].src = "Jeremiah";
        myGraph.edge[2].dest = "Gerald";

        // Edge 4
        myGraph.edge[3].src = "Jeremiah";
        myGraph.edge[3].dest = "Andried";

        // Edge 5
        myGraph.edge[4].src = "Frankie";
        myGraph.edge[4].dest = "Ericka";

        // Edge 6
        myGraph.edge[5].src = "Frankie";
        myGraph.edge[5].dest = "Bruce";

        // Edge 7
        myGraph.edge[6].src = "Frankie";
        myGraph.edge[6].dest = "Charlize";

        // Edge 8
        myGraph.edge[7].src = "Gerald";
        myGraph.edge[7].dest = "Andried";

        // Edge 9
        myGraph.edge[8].src = "Gerald";
        myGraph.edge[8].dest = "Lovely";

        // Edge 10
        myGraph.edge[9].src = "Andried";
        myGraph.edge[9].dest = "Vergel";

        // Edge 11
        myGraph.edge[10].src = "Ericka";
        myGraph.edge[10].dest = "Riki";

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
