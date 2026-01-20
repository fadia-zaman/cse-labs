public class sumOfOddNumbers{
  public static void main(String[] args){
    int n=7;
    int sum=0;
    int oddNumber=1;
    System.out.println("The odd numbers are:");
    while(oddNumber<=n*2){
      if(oddNumber%2!=0){
        System.out.println(oddNumber);
        sum=sum+oddNumber;
      }
      oddNumber=oddNumber+1;
    }
    System.out.print("The Sum of odd Natural Numbers up to 5 terms is:"+sum);
  }
}
      