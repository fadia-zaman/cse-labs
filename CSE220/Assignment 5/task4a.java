public class task4a{
  
  public static int[][] directedToUndirected(int[][] adjmat){
    int[][] undirected=new int[adjmat.length][adjmat.length];
    
    for(int i=0;i<adjmat.length;i++){
      for(int j=0;j<adjmat[i].length;j++){
        int w1=adjmat[i][j];
        int w2=adjmat[j][i];
        undirected[i][j]=w1+w2;
        undirected[j][i]=w1+w2;
      }
    }
    return undirected;
  }
}