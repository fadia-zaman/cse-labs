import java.util.Scanner;
public class task7{
  public static void main(String[] args){
    System.out.println("N:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double[] arr=new double[n];
    double[] arr2=new double[n];
    
    
    for(int i=0;i<n;i++){
      arr[i]=sc.nextDouble();
    }
    
    int count=0;
    int ind=0;
    
    
    for(int j=0;j<n;j++){
      boolean flag=false;
      for(int k=0;k<ind;k++){
        if(arr[j]==arr2[k]){
          flag=true;
          count++;
        }
      }
      
      if(flag==false){
         arr2[ind] = arr[j];
         ind++;
      }
    }
    
     System.out.print("New Array:");
    for(int m=0;m<ind;m++){
      System.out.print(arr2[m]+" ");
  }
    
    System.out.println();
    System.out.println("Removed elements:"+count);
}
}
      
    