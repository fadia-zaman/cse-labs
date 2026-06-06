import java.util.Scanner;
public class task8{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("row =");
    int ro=sc.nextInt();
    
    System.out.println("column =");
    int co=sc.nextInt();
    
    int[] [] ar1= new int[ro][co];
    int[] ar2=new int[ro*co];
    
    for(int i=0;i<ro;i++){
      for(int j=0;j<co;j++){
        ar1[i][j]=sc.nextInt();
      }
    }
    
  System.out.println("2D ARRAY:");
    for(int k=0;k<ro;k++){
      for(int l=0;l<co;l++){
        System.out.print(ar1[k][l]+" ");
      }
    System.out.println();
  }
    
    int ind=0;
    for(int m=0;m<ro;m++){
      for(int n=0;n<co;n++){
        ar2[ind]=ar1[m][n];
        ind++;
      }
    }
    
    System.out.println("1D ARRAY:");
    for(int p=0;p<(ro*co);p++){
     System.out.print(ar2[p]+" ");
    }
}
}
    