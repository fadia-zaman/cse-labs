import java.util.Arrays;

public class TesterTask4a {
    public static void main(String[] args) {
        int[][] directed = {
            {0, 3, 0},
            {2, 0, 4},
            {0, 0, 0}
        };

        int[][] undirected = task4a.directedToUndirected(directed);

        System.out.println("Undirected Graph Adjacency Matrix:");
        for (int i = 0; i < undirected.length; i++) {
            System.out.println(Arrays.toString(undirected[i]));
        }
    }
}
