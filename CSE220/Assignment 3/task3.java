public class task3{
 
  public static int[] machine(int[] ar,int m){
   
    minHeap heap=new minHeap(m);
    for(int i=0;i<m;i++){
      heap.insert(0);
    }
    
    for(int i=0;i<ar.length;i++){
      int p=heap.extractMin();
      int s=p+ar[i];
      heap.insert(s);
    }
    int[] output=new int[m];
    for(int i=0;i<m;i++){
      output[i]=heap.extractMin();
    }
    return output;
  }
}
    
    
    
    
    
    