public class maxNumber{
  public static void main ( String[]  args){
    double a=26.42;
    double b=0.02;
    double c=13.56;
    if (a>b && a>c){
      System.out.println("Maximum number is"+" "+a);
      if (b>c){
        System.out.println("Minimum number is"+" "+c);
      }
      else{
        System.out.println("Minimum number is"+" "+b);
      }
    }
    else if (b>a && b>c){
      System.out.println("Maximum number is"+" "+b);
      if (a>c){
        System.out.println("Minimum number is"+" "+c);
      }
      else{
        System.out.println("Minimum number is"+" "+a);
      }
    }
    else {
      System.out.println("Maximum number is"+" "+c);
      if (a>b){
        System.out.println("Minimum number is"+" "+b);
      }
        else{
          System.out.println("Minimum number is"+" "+a);
        }
    }
  }
}