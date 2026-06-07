public class task1atester{
public static void main(String[] args) {
        int[][] adjmat = {
            {0, 1, 1, 0},
            {1, 0, 1, 0},
            {1, 1, 0, 1},
            {0, 0, 1, 0}
        };
int maxDeg = task1a.maxDegree(adjmat);

        System.out.println("Maximum degree in the graph: " + maxDeg);
    }
}
  
