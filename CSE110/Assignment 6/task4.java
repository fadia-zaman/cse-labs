import java.util.Scanner;
public class task4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter N:");
    int N=sc.nextInt();
    int[] array1=new int[N];
    for(int i=0;i<N;i++){
      System.out.print("Enter a number:");
      array1[i]=sc.nextInt();
    }
    System.out.println("Original array:");
    for(int i=0;i<N;i++){
      System.out.print(array1[i]+" ");
    }
    System.out.println();
    System.out.println("After modifying:");
    for(int i=0;i<N;i++){
      if(array1[i]>0){
        array1[i]=1;
      }
      else if(array1[i]<0){
        array1[i]=0;
      }
      System.out.print(array1[i]+" ");
    }
  }
}

              