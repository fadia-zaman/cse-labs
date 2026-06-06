import java.util.Scanner;
public class task9{
  public static int sumDigits(int nmb){
    if(nmb==0){
      return 0;
    }
    return (nmb%10)+sumDigits(nmb/10);
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int nmb=sc.nextInt();
    int res=sumDigits(nmb);
    System.out.println(res);
  }
}