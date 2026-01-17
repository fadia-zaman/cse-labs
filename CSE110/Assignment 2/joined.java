public class joined{
  public static void main ( String[]  args){
    int id=20201307;
    id= id/100000;
    int year = id/10;
    int session = id%10;
    if (session==1){
      System.out.println("Student Joined BRAC in Spring" +" "+ year);
    }
    else if (session==3){
      System.out.println("Student Joined BRAC in Summer" +" "+ year);
    }
    else if (session==2){
      System.out.println("Student Joined BRAC in Fall" +" "+ year);
    }
  }
}
  