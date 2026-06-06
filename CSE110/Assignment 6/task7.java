import java.util.Scanner;
public class task7{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the array:");
    int N=sc.nextInt();
    int[] array=new int[N];
    for(int i=0;i<N;i++){
      System.out.println("Enter a number:");
      array[i]=sc.nextInt();
    }
    System.out.println("Input array:");
    for(int i=0;i<N;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
    int[] new_array=new int[N];
    int count=0;
    for(int i=0;i<N;i++){
      boolean flag=false;
      for(int j=0;j<count;j++){
        if(array[i]==new_array[j]){
          flag=true;
          break;
        }
      }
      if(flag==false){
        new_array[count]=array[i];
        count++;
      }
    }
    System.out.println("New array:");
    for(int i=0;i<count;i++){
     System.out.print(new_array[i]+" ");
      }
  }
}
