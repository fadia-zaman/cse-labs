import java.util.Scanner;
public class task1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=10;
    int max_val=0;
    int min_val=0;
    int sum=0;
    int count=0;
    
    for(int i=0;i<n;i++){
      int nmbr = sc.nextInt();
      if(nmbr>0&&nmbr%2!=0){
        sum+=nmbr;
        count++;
        if(count==1){
          max_val=nmbr;
          min_val=nmbr;
        }
        
        else{
          if(max_val<nmbr){
          max_val=nmbr;
        }
          
          if(min_val>nmbr){
            min_val=nmbr;
          }
        }
      }
    }
    
    if(count>0){
     double avrg=(double)sum/count;
    System.out.println("Sum:"+sum);  
    System.out.println("Minimum:"+min_val);
    System.out.println("Maximum:"+max_val);
    System.out.println("Average:"+avrg);
  }
    
    else{
        System.out.println("No odd positive numbers are found");
      }
  }
}
