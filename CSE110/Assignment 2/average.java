public class average{
  public static void main ( String[]  args){
    int i=7;
    int sum=0;
    double average=0;
    int count=0;
    while(i<13){
     sum= sum+i;
     count=count+1;
     i=i+1;
    }
       average=sum/count;
       System.out.println(sum);
       System.out.println(average);
  }
}