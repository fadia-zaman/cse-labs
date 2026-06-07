public class task2b{
  int numVertices;
  WEdge[] list;
  
  public task2b(int numVertices){
    this.numVertices=numVertices;
    list=new WEdge[numVertices];
  }
  
  public void addEdge(int[][] edge){
    for(int i=0;i<edge.length;i++){
    int u= edge[i][0];
    int v= edge[i][1];
    int w = edge[i][2];
    addEdge(u,v,w);
    addEdge(v,u,w);
    }
  }
  private void addEdge(int u,int v,int w){
    WEdge newList=new WEdge(u,v,w,list[u]);
    list[u]=newList;
  }
  
  public int maxVertex(){
    int maxsum=0;
    int maxvertex=0;
    
    for(int i=0;i<numVertices;i++){
      int sum=0;
      WEdge curr=list[i];
      
      while(curr!=null){
        sum+=curr.lw;
        curr=curr.next;
      }
      
      if(sum>maxsum){
        maxsum=sum;
        maxvertex=i;
      }
    }
    return maxvertex;
  }
}
    
    
    
    
  
  
  
  
    
    
    