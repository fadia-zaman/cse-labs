public class maxheap{
  private int size;
  private int[] ar;
  
  public maxheap(int capacity){
    
    ar=new int[capacity];
    size=0;
  }
  
  public void insert(int val){
    ar[size]=val;
    swim(size);
    size++;
  }
  
  public void swim(int i){
    while(i>0){
      int parenti=(i-1)/2;
      if(ar[i]>ar[parenti]){
        int temp=ar[i];
        ar[i]=ar[parenti];
        ar[parenti]=temp;
        i=parenti;
      }
      
      else{
        break;
      }
    }
  }
  
  public int extractmax(){
    if(size==0){
      return 0;
    }
    
    int max=ar[0];
    ar[0]=ar[size-1];
    size--;
    sink(0);
    return max;
  }
  
  public void sink(int i){
    while(2*i+1<size){
      int left=2*i+1;
      int right=2*i+2;
      int large=left;
      
      if(2*i+2<size && ar[right]>ar[left]){
        large=right;
      }
      
      if(ar[i]>=ar[large]){
        break;
      }
      
      int temp=ar[i];
      ar[i]=ar[large];
      ar[large]=temp;
      i=large;
    }
  }
        
  public int[] heapsort(){
    int ogsize=size;
    int[] copy= new int[size];
    for(int i=0;i<size;i++){
      copy[i]=ar[i];
    }
    int[] newar=new int[size];
    
    for(int i=0;i<newar.length;i++){
      newar[i]=extractmax();
    }
    
    for(int i=0;i<newar.length/2;i++){
      int temp=newar[i];
      newar[i]=newar[newar.length-i-1];
      newar[newar.length-i-1]=temp;
    }
    
    for(int i=0;i<ogsize;i++){
    ar[i]=copy[i];
    }
    size=ogsize;
    return newar;
  }
}
