import java.util.Scanner;
public class task7{
  public static void oneToN(int s,int N){
    if(s>N){
      return;
    }
    System.out.print(s+ " ");
    oneToN(s+1,N);
  }
  
  public static void ntoOne(int st,int n){
    if(n<st){
      return;
    }
    System.out.print(n+" ");
    ntoOne(st,n-1);
  }
  
  public static int recursiveSum(int sta,int nm){
    if(sta>nm){
      return 0;
    }
    return sta+recursiveSum(sta+1,nm);
  }
    
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      
      int N=sc.nextInt();
      oneToN(1,N);
      System.out.println();
      
      int n=sc.nextInt();
      ntoOne(1,n);
      System.out.println();
      
      int nm=sc.nextInt();
      int res=recursiveSum(1,nm);
      System.out.println(res);
    }
  }

      
    