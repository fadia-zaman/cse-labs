public class task4{
  
  public static int[] maxNum(int[] nums, int k){
    maxheap heap=new maxheap(nums.length);
    for(int i=0;i<nums.length;i++){
      heap.insert(nums[i]);
    }
    
    int[] output=new int[k];
  
  for(int i=0;i<k;i++){
    int p=heap.extractmax();
    output[i]=p;
  }
  
  return output;
}
}