import java.util.Scanner;
public class task5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter N:");
    int N=sc.nextInt();
    int[] array=new int[N];
    for(int i=0;i<N;i++){
      System.out.println("Enter a number:");
      array[i]=sc.nextInt();
    }
    int num=sc.nextInt();
    boolean flag=false;
    for(int i=0;i<N;i++){
      if(array[i]==num){
        System.out.println(num+" "+"is at index"+" "+i);
        flag=true;
        break;
      }
    }
    if(flag==false){
      System.out.println("Element not found");
    }
  }
}
