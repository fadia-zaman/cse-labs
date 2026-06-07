public class unweightedList{
  private int numVertices;
  private Edge[] list;
  
  public unweightedList(int numVertices){
    this.numVertices= numVertices;
    list=new Edge[numVertices];
  }
  
  public void addEdge(int[][] edges){
    for(int i=0;i<edges.length;i++){
      int u= edges[i][0];
      int v= edges[i][1];
      addEdge(u,v);
      addEdge(v,u);
    }
  }
  
  private void addEdge(int u,int v){
    Edge newList=new Edge(u,v,list[u]);
    list[u]= newList;
  }
  
  public void printList(){
    for(int i=0;i<numVertices;i++){
      System.out.print(i+":");
      Edge curr=list[i];
    
      while(curr!=null){
        System.out.print(curr.ld+" ");
        curr=curr.next;
      }
      System.out.println();
    }
  }
  
  public void findNeighbour(int f){
    
    Edge curr=list[f];
    
    while(curr!=null){
      System.out.print(curr.ld+" ");
      curr=curr.next;
    }
    System.out.println();
  }
}
    
    
    
    
    
    
    
    
    
    
  
  
  
  