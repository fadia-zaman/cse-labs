import java.util.Scanner;
public class task9{
  public static void main (String [] args){
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter n:");
    int n=sc.nextInt();
    for (int r=1;r<=n;r++){
      for(int s=1;s<=n-r;s++){
        System.out.print(" ");
      }
      for (int num=1;num<=r;num++){
        System.out.print(num);
      }
      System.out.println();
    }
  }
}
