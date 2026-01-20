public class totalDivisor{
  public static void main(String [] args){
    int n=6;
    int count=0;
    for (int i=1;i<=n;i=i+1){
      if(n%i==0){
        System.out.println(i);
        count=count+1;
      }
    }
    System.out.print("Total Divisors:"+count);
  }
}