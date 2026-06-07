public class task2a{
  public static int maxVertex(int[][] adjmat){
    int maxsum=0;
    int maxvertex=0;
    
    for(int i=0;i<adjmat.length;i++){
      int sum=0;
      for(int j=0;j<adjmat[i].length;j++){
        sum+=adjmat[i][j];
      }
      
      if(sum>maxsum){
        maxsum=sum;
        maxvertex=i;
      }
      
    }
    
    return maxvertex;
  }
}
    