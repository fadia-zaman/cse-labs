public class equalOrDifferent{
  public static void main ( String[]  args){
    int a=230;
    int b=230;
    int c=230;
    if (a==b&&a==c){
      System.out.println("All numbers are equal");
    }
    else if (a!=b && a!=c && b!=c){
      System.out.println("All numbers are different");
    }
    else {
      System.out.println("Neither all are equal or different");
  }
  }
}