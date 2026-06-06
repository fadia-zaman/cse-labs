import java.util.Scanner;
public class task2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int nmbr1=sc.nextInt();
    int nmbr2=sc.nextInt();
    int p_count=0;
    
    if(nmbr2<nmbr1){
      int temp=nmbr1;
      nmbr1=nmbr2;
      nmbr2=temp;
    }
    
    for(int i=nmbr1;i<=nmbr2;i++){
      int div_count=0;
      for(int j=2;j<i;j++){
        if(i%j==0){
         div_count++;
        }
      }
      
        if(div_count==0){
          p_count++;
        }
      }
    
    System.out.println("There are"+" "+p_count+" "+"prime numbers between"+" "+nmbr1+" "+"and"+" "+nmbr2);
  }
}
      
      
        
        
        