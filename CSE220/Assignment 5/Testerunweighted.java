public class Testerunweighted {
    public static void main(String[] args) {

        unweightedMatrix graph = new unweightedMatrix(4);

        int[][] edges = {
            {0, 1, 2},
            {0, 2, 3},
            {1, 2, 7},
            {2, 3, 9}
        };

        graph.addEdge(edges);

        System.out.println("Adjacency Matrix:");
        graph.printMatrix();

        System.out.print("Neighbours of vertex : ");
        graph.findNeighbour(0);
    }
}
