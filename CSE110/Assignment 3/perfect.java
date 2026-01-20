public class perfect{
  public static void main(String [] args){
    int n=6;
    int sum_divisors=0;
    for(int i=1;i<n;i=i+1){
      if(n%i==0){
        sum_divisors=sum_divisors+i;
      }
    }
    if(sum_divisors==n){
      System.out.println(n+" "+"is a perfect number");
    }
  }
}