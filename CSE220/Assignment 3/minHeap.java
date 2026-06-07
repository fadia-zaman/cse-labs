public class minHeap{
  private int[] ar;
  private int size;
  
  public minHeap(int capacity){
    ar=new int[capacity];
    size=0;
  }
  
  public void insert(int val){
    ar[size]=val;
    swim(size);
    size++;
  }
  
  public void swim(int ind){
    while(ind>0){
      int parentInd=(ind-1)/2;
      if(ar[parentInd]>ar[ind]){
        int temp=ar[ind];
        ar[ind]=ar[parentInd];
        ar[parentInd]=temp;
        ind=parentInd;
      }
      
      else{
        break;
      }
    }
  }
  
  public int extractMin(){
    if(size==0){
      return 0;
    }
    
    int min=ar[0];
    ar[0]=ar[size-1];
    size--;
    sink(0);
    return min;
  }
  
  public void sink(int i){
    while((2*i)+1<size){
      int left=2*i +1;
      int right=2*i +2;
      int small=left;
      
      if(2*i+2<size && ar[small]>ar[right]){
        small=right;
      }
      
      if(ar[i]<=ar[small]){
        break;
      }
      
      int temp=ar[i];
      ar[i]=ar[small];
      ar[small]=temp;
      i=small;
    }
  }
  
  public int[] heapSort(){
    int ogsize=size;
    int[] copyar=new int[size];
    for(int i=0;i<size;i++){
      copyar[i]=ar[i];
    }
    
    int[] sort=new int[size];
    
    for(int i=0;i<ogsize;i++){
      sort[i]=extractMin();
    }
    
    for(int i=0;i<sort.length/2;i++){
      int temp=sort[i];
      sort[i]=sort[sort.length-1-i];
      sort[sort.length-1-i]=temp;
    }
    
    for(int i=0;i<ogsize;i++){
      ar[i]=copyar[i];
    }
    size=ogsize;
    return sort;
    
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      
      
      
      
      
      
      
      
      
      
      
      