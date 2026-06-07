public class TesterTask2a {
    public static void main(String[] args) {
        // Example graph (undirected, weighted)
        int[][] adjmat = {
            {0, 3, 2, 0},
            {3, 0, 4, 0},
            {2, 4, 0, 1},
            {0, 0, 1, 0}
        };

        // Find vertex with maximum sum of edge weights
        int vertex = task2a.maxVertex(adjmat);

        // Calculate the sum for that vertex
        int sum = 0;
        for (int j = 0; j < adjmat[vertex].length; j++) {
            sum += adjmat[vertex][j];
        }

        System.out.println("Vertex with maximum sum of edge weights: " + vertex);
        
    }
}
