import java.util.Scanner;
public class task6{
  public static double calcTax(int ag,double sal){
    if(ag<18){
      return 0.0;
    }
    if(sal<10000){
      return 0.0;
    }
    if(sal>=10000&&sal<=20000){
      return sal*0.07;
    }
    if(sal>20000){
      return sal*0.14;
    }
    return 0.0;
  }
  
  public static void calcYearlyTax(){
    Scanner sc=new Scanner(System.in);
    int ag=sc.nextInt();
    double totaltx=0.0;
    for(int i=1;i<=12;i++){
      double monthlysal=sc.nextDouble();
      double monthlytx=calcTax(ag,monthlysal);
      totaltx+=monthlytx;
       System.out.println("month"+i+" "+"tax:"+monthlytx);
      }
    System.out.println(totaltx);
  }
  
    public static void main(String[] args){
      double tx=calcTax(22,15500);
      System.out.println(tx);
      
      calcYearlyTax();
    }
  }
      