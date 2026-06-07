public class task3a{
  public static int maxOutDegree(int[][] adjmat){
  int maxdegree=0;
  
  for(int i=0;i<adjmat.length;i++){
    int degree=0;
    for(int j=0;j<adjmat[i].length;j++){
      if(adjmat[i][j]!=0){
        degree++;
      }
    }
      if(degree>maxdegree){
        maxdegree=degree;
      }
    }  
  return maxdegree;
  }
}
  