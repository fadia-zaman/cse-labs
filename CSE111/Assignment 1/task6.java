import java.util.Scanner;
public class task6{
  public static void main(String[] args){
    System.out.println("N:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr1=new int[n];
    boolean[] arr2=new boolean[n];
    
    for(int i=0;i<n;i++){
      arr1[i]=sc.nextInt();
    }
    
    for(int j=0;j<n;j++){
      if(arr2[j]==false){
        int co=1;
        
        for(int k=j+1;k<n;k++){
          if(arr1[j]==arr1[k]){
            co++;
            arr2[k]=true;
          }
        }
        
      System.out.println(arr1[j]+"-"+ co+"times");
      }
    }
    }
  }

    