import java.util.Scanner;
public class task8{
  public static void main (String [] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter l:");
    int l=sc.nextInt();
    System.out.println("Enter w:");
    int w=sc.nextInt();
    for (int r=1;r<=w;r++){
      for(int c=1;c<=l;c++){
        System.out.print(c);
      }
      System.out.println();
    }
  }
}