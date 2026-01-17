public class triangle{
  public static void main ( String[]  args){
    int a=3;
    int b=3;
    int c=3;
    if (a==b&&a==c){
      System.out.println("This is a Equilateral triangle");
    }
    else if (a==b||b==c||a==c){
      System.out.println("This is a Isosceles triangle");
    }
    else if (a!=b && a!=c && b!=c){
      System.out.println("This is a Scalene triangle");
    }
  }
}
    