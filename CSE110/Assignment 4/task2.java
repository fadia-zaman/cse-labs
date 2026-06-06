import java.util.Scanner;
public class task2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    while (true) {
      System.out.println("enter number:");
      int n=sc.nextInt();
      if(n<0){
        break;
      }
        int sq=n*n;
        System.out.println(n+"^2="+sq);
      }
    }
  }
