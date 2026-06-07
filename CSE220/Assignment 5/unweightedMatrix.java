public class unweightedMatrix{
  private int numVertices;
  private int[][] adjmatrix;
  
  public unweightedMatrix(int numVertices){
    this.numVertices=numVertices;
    adjmatrix=new int[numVertices][numVertices];
  }
  
  public void addEdge(int[][] edge){
    for(int i=0;i<edge.length;i++){
    int u=edge[i][0];
    int v=edge[i][1];
    //for weighted: int w=edge[i][2];
    adjmatrix[u][v]=1; //w;
    adjmatrix[v][u]=1; //w; //if directed this line no no
    }
  }
    
  
  public void printMatrix(){
    for(int i=0;i<adjmatrix.length;i++){
      for(int j=0;j<adjmatrix[0].length;j++){
        System.out.print(adjmatrix[i][j]+" ");
      }
    
    System.out.println();
  }
  }
  
  public void findNeighbour(int v){
    for(int i=0;i<numVertices;i++){
      if(adjmatrix[v][i]!=0){
        System.out.print(i+" ");
      }
    }
    System.out.println();
  }
}
  
  
  
  
  
  
  
  