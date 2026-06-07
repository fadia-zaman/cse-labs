public class TesterTask3a {
    public static void main(String[] args) {
        int[][] adjmat = {
            {0, 3, 2, 0},
            {0, 0, 4, 0},
            {0, 0, 0, 1},
            {0, 0, 0, 0}
        };

        int maxOutDegreeVertex = task3a.maxOutDegree(adjmat);
        //int maxOutWeightVertex = task3a.maxOutWeightSum(adjmat);

        System.out.println("Vertex with maximum out-degree: " + maxOutDegreeVertex);
        //System.out.println("Vertex with maximum sum of outgoing weights: " + maxOutWeightVertex);
    }
}
