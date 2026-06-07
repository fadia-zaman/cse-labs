public class task1b{
  int numVertices;
  Edge[] list;
  
  public task1b(int numVertices){
    this.numVertices=numVertices;
    list=new Edge[numVertices];
  }
  
  public void addEdge(int[][] edges){
    for(int i=0;i<edges.length;i++){
      int u=edges[i][0];
      int v=edges[i][1];
      addEdge(u,v);
      addEdge(v,u);
    }
  }
  
  private void addEdge(int u,int v){
    Edge newList=new Edge(u,v,list[u]);
    list[u]=newList;
  }
  
  public int maxDegree(){
    int maxdegree=0;
    
    for(int i=0;i<numVertices;i++){
      int degree=0;
      
      Edge curr=list[i];
      
      while(curr!=null){
        degree++;
        curr=curr.next;
      }
      
      if(degree>maxdegree){
        maxdegree=degree;
      }
    }
    
    return maxdegree;
  }
}
    
  
  
  
  
  
  
  
  