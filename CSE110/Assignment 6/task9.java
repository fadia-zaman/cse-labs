import java.util.Scanner;
public class task9{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length:");
    int N=sc.nextInt();
    int[] array=new int[N];
    for(int i=0;i<N;i++){
      System.out.println("Enter a number:");
      array[i]=sc.nextInt();
    }
    System.out.println("Original Array:");
    for(int i=0;i<N;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
    for(int i=0;i<N;i++){
      int max=i;
      for(int j=i+1;j<N;j++){
        if(array[j]>array[max]){
          max=j;
        }
      }
      int temp=array[i];
      array[i]=array[max];
      array[max]=temp;
    }
    System.out.println("Sorted Array:");
    for(int i=0;i<N;i++){
      System.out.print(array[i]+" ");
    }
  }
}
    
   

    
