import java.util.Scanner;
public class task3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the array:");
    int len=sc.nextInt();
    int[] array1=new int[len];
    for(int i=0;i<len;i++){
      System.out.println("Enter a number:");
      array1[i]=sc.nextInt();
    }
    int[] array2=new int[len];
    for(int i=0;i<len;i++){
      array2[i]=array1[len-1-i];
    }
    System.out.println("Reversed using a new array:");
    for(int i=0;i<len;i++){
      System.out.print(array2[i]+" ");
    }
    System.out.println();
    for(int i=0;i<len/2;i++){
      int temp=array1[i];
      array1[i]=array1[len-1-i];
      array1[len-1-i]=temp;
    }
    System.out.println("Reversed the original array:");
    for(int i=0;i<len;i++){
      System.out.print(array1[i]+" ");
    }
    System.out.println();
  }
}
