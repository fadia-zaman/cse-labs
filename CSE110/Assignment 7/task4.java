import java.util.Scanner;
public class task4{
  public static boolean isPrime(int nmb){
    for(int i=2;i<nmb;i++){
      if(nmb%i==0){
        return false;
      }
    }
    return true;
  }
  
  public static boolean isPerfect(int nmb){
    int sum=0;
    for(int i=1;i<=nmb/2;i++){
      if(nmb%i==0){
        sum=sum+i;
      }
    }
    return sum==nmb;
  }
  
  public static int special_sum(int l){
    int sum=0;
    for(int i=2;i<=l;i++){
      if(isPrime(i)||isPerfect(i)){
        sum=sum+i;
      }
    }
    return sum;
  }
  
  public static void main(String[] args){
    boolean ans=isPrime(6);
    System.out.println(ans);
    
    boolean res=isPerfect(6);
    System.out.println(res);
    
    Scanner sc=new Scanner(System.in);
    int input=sc.nextInt();
    int output=special_sum(input);
    System.out.println(output);
    
  }
}
      