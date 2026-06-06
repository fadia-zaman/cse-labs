import java.util.Scanner;
public class task5{
  public static void main(String[] args){
    System.out.println("Enter the length of an array:");
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    int[] array = new int[len];
    
    
    for(int i=0;i<len;i++){
      array[i]=sc.nextInt();
    }
    
    
    for(int j=0;j<len;j++){
      for(int k=j+1;k<len;k++){
        int temp=array[j];
        array[j]=array[k];
        array[k]=temp;
      }
    }
    
    
    for(int m=0;m<len;m++){
      System.out.print(array[m]+ " ");
    }
    
  }
}

    
    
    