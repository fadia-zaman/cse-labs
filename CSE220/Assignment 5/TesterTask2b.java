public class TesterTask2b {
    public static void main(String[] args) {
        int numVertices = 4;

        // Each edge: {source, destination, weight}
        int[][] edges = {
            {0, 1, 3},
            {0, 2, 2},
            {1, 2, 4},
            {2, 3, 1}
        };

        // Create graph
        task2b graph = new task2b(numVertices);

        // Add edges
        graph.addEdge(edges);

        // Find vertex with maximum sum of edge weights
        int maxVertex = graph.maxVertex();

        // Calculate sum for verification
        int sum = 0;
        WEdge curr = graph.list[maxVertex];
        while (curr != null) {
            sum += curr.lw;
            curr = curr.next;
        }

        System.out.println("Vertex with maximum sum of edge weights: " + maxVertex);
       
    }
}
