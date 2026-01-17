public class divisible{
  public static void main ( String[]  args){
    int a=36;
    if (a%5==0 && a%7==0){
      System.out.println("Divisible by Both");
    }
    else if (a%5==0&& a%7!=0){
      System.out.println("Invalid: Divisible by 5 Only");
    }
    else if (a%5!=0&& a%7==0){
      System.out.println("Invalid: Divisible by 7 Only");
    }
    else{
      System.out.println("NO");
    }
  }
}
    
      
      