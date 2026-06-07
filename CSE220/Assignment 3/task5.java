public class task5{
  
  public static String[] maxprior(String[] taskName, int[] priority){
    maxheap5 heap=new maxheap5(priority.length);
    
    for(int i=0;i<priority.length;i++){
      heap.insert(new task(taskName[i],priority[i]));
    }
    
    String[] output=new String[priority.length];
    
    for(int i=0;i<priority.length;i++){
      output[i]=heap.extractmax().names;
    }
    
    return output;
  }
}