import java.util.Scanner;
public class task5{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("The value of N:");
    int N=sc.nextInt();
    int y=0;
    int sum=0;
    for(int i=1;i<=N;i++){
      sum+=i;
      y-=sum;
    }
    System.out.println("The value of y:"+y);
  }
}
    