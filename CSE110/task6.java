import java.util.Scanner;
public class task6{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    while(true){
      System.out.println("Enter Number:");
      int n=sc.nextInt();
      if (n%2!=0){
        break;
      }
      int div_count=0;
      for(int i=1;i<=n;i++){
        if (n%i==0){
          div_count++;
        }
      }
      System.out.println(n+" "+"has"+" "+div_count+" "+"divisors");
    }
  }
}