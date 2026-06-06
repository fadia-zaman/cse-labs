public class task3{
  public static boolean isTriangle(int f,int g,int h){
    if(f+g>h&&f+h>g&&g+h>f){
      return true;
    }
    else{
      return false;
    }
  }
  
  public static void triArea(int f,int g,int h){
    if(isTriangle(f,g,h)){
      double s=(f+g+h)/2.0;
      double area=Math.sqrt(s*(s-f)*(s-g)*(s-h));
      System.out.println(area);
    }
    else{
      System.out.println("not a triangle");
  }
  }
  
  public static void main(String[] args){
    boolean ans=isTriangle(1,5,2);
    System.out.println(ans);
    
    triArea(7,5,10);
  }
}