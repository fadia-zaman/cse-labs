import java.util.Scanner;
public class task10{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of students:");
    int n=sc.nextInt();
    int[] num=new int[n];
    String[] name=new String[n];
    for(int i=0;i<n;i++){
      System.out.println("Enter marks:");
      num[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      System.out.println("Enter names:");
      name[i]=sc.next();
    }
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-1-i;j++){
        if(num[j]>num[j+1]){
          int temp1=num[j];
          num[j]=num[j+1];
          num[j+1]=temp1;
          String temp2=name[j];
          name[j]=name[j+1];
          name[j+1]=temp2;
        }
      }
    }
    System.out.println("Sorted Array:");
    for(int i=0;i<n;i++){
      System.out.print(num[i]+" ");
      }
    System.out.println();
    for(int i=0;i<n;i++){
      System.out.print(name[i]+" ");
    }
  }
}

    