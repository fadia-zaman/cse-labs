import java.util.Scanner;
public class task8{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Please enter the length of first array: ");
    int N1=sc.nextInt();
    int[] array1=new int[N1];
    System.out.println("Please enter the elements of the array1:");
    for(int i=0;i<N1;i++){
      array1[i]=sc.nextInt();
    }
    System.out.print("Please enter the length of second array: ");
    int N2=sc.nextInt();
    int[] array2=new int[N2];
    System.out.println("Please enter the elements of the array2:");
    for(int i=0;i<N2;i++){
      array2[i]=sc.nextInt();
    }
    boolean flag1=true;
    for(int i=0;i<N2;i++){
      boolean flag2=false;
      for(int j=0;j<N1;j++){
        if(array2[i]==array1[j]){
          flag2=true;
          break;
        }
      }
      if(flag2==false){
        flag1=false;
        break;
      }
    }
    if(flag1==true){
      System.out.println("Array 2 is a subset of Array 1");
    }
    else{
      System.out.println("Array 2 is not a subset of Array 1");
    }
  }
}

    
    