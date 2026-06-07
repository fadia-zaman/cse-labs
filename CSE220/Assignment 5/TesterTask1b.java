public class TesterTask1b {
    public static void main(String[] args) {
        // Example graph: 4 vertices, edges: 0-1, 0-2, 1-2, 2-3
        int numVertices = 4;
        int[][] edges = {
            {0, 1},
            {0, 2},
            {1, 2},
            {2, 3}
        };

        // Create the graph
        task1b graph = new task1b(numVertices);

        // Add edges
        graph.addEdge(edges);

        // Print maximum degree
        System.out.println("Maximum degree: " + graph.maxDegree());
    }
}
