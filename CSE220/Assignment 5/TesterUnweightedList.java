import java.util.Arrays;

public class TesterUnweightedList {
    public static void main(String[] args) {

        // 1?? Number of vertices
        int numVertices = 4;

        // 2?? Create the unweighted adjacency list graph
        unweightedList graph = new unweightedList(numVertices);

        // 3?? Define edges: each pair [u,v] represents an edge
        int[][] edges = {
            {0, 1},
            {0, 2},
            {1, 2},
            {2, 3}
        };

        // 4?? Add edges to the graph
        graph.addEdge(edges);

        // 5?? Print the adjacency list
        System.out.println("Adjacency List:");
        graph.printList();

        // 6?? Find neighbors of a specific vertex
        System.out.print("Neighbours of vertex 2: ");
        graph.findNeighbour(2);

        System.out.print("Neighbours of vertex 0: ");
        graph.findNeighbour(0);
    }
}
