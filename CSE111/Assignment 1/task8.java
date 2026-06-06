import java.util.Scanner;
public class task8{
  public static void reverseDigits(int nmr){
    if(nmr==0){
      return;
    }
    System.out.println(nmr%10);
    reverseDigits(nmr/10);
  }
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int nmr=sc.nextInt();
    reverseDigits(nmr);
  }
}
  