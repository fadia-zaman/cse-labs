import java.util.Scanner;
public class task3{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an integar:");
    int n=sc.nextInt();
    int neg=0;
    int non_neg=0;
    for(int i=1;i<=n;i++){
      System.out.println("Enter Number"+" "+i+":");
      int num=sc.nextInt();
      if(num>=0){
        non_neg++;
      }
      else{
        neg++;
      }
    }
    System.out.println(non_neg+" "+"Non-negative Numbers");
    System.out.println(neg+" "+"Negative Numbers");
  }
}
    