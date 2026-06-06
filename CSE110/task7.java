import java.util.Scanner;
public class task7{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of test runs:");
    int N=sc.nextInt();
    
    for(int i=1;i<=N;i++){
      System.out.println("Enter X:");
      int X=sc.nextInt();
      System.out.println("Enter Y:");
      int Y=sc.nextInt();
      int odd_count=0;
      int s=0;
      for(int a=X;odd_count<Y;a++){
        if(a%2!=0){
          odd_count++;
          s+=a;
        }
      }
      System.out.println(s);
    }
  }
}