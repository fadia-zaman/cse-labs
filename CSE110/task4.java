import java.util.Scanner;
public class task4{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int num=2;
    int p_count=0;
    while(p_count<N){
      int div_count=0;
      for(int i=2;i<=num/2;i++){
        if (num % i == 0) {
        div_count++;
      }
      }
      if(div_count==0){
        System.out.println(num);
        p_count++;
      }
      num++;
    }
  }
}
    