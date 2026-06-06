import java.util.Scanner;
public class task2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter N: ");
    int N=sc.nextInt();
    int[] array1=new int[N];
    System.out.println("Enter the array:");
    for(int i=0;i<N;i++){
      array1[i]=sc.nextInt();
    }
    System.out.println("Before removing duplicates:");
    for(int i=0;i<array1.length;i++){
      System.out.print(array1[i]+" ");
    }
    System.out.println();
    for(int i=0;i<array1.length;i++){
      for(int j=i+1;j<array1.length;j++){
        if(array1[i]==array1[j]){
          array1[j]=0;
        }
      }
    }
    System.out.println("After replacing duplicates with 0:");
    for(int i=0;i<array1.length;i++){
      System.out.print(array1[i]+" ");
    }
  }
}
        
