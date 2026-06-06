import java.util.Scanner;
public class task11{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Start:");
    int s=sc.nextInt();
    System.out.println("End:");
    int e=sc.nextInt();
    System.out.println("Armstrong numbers:");
    for(int num=s;num<=e;num++){
      double sum=0;
      int count=0;
      int n=num;
      int main_number=num;
      while(n!=0){
        n=n/10;
        count++;
      }
      n=num;
      while(n!=0){
        int digit=n%10;
        sum=sum+(Math.pow(digit,count));
        n=n/10;
      }
      if(sum==main_number){
       
        System.out.println(main_number);
      }
    }
  }
}
        