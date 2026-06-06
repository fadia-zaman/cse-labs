public class task2{
  public static double circleArea(double rad){
    double area=Math.PI*rad*rad;
    return area;
  }
  
  public static double sphereVolume(double rad){
    double vol=(4.0/3.0)*Math.PI*rad*rad*rad;
    return vol;
  }
  
  public static void findSpace(double d,String s){
    double rad=d/2.0;
    if(s.equals("circle")){
      double area=circleArea(rad);
      System.out.println(area);
    }
       else if(s.equals("sphere")){
         double vol=sphereVolume(rad);
         System.out.println(vol);
       }
       else{
         System.out.println("Wrong Parameter");
       }
       
  }
 
  public static void main(String[] args){
    double area=circleArea(7);
    System.out.println(area);
    
    double vol=sphereVolume(5);
    System.out.println(vol);
    
    findSpace(19,"circle");
    findSpace(3,"sphere");
  }
}