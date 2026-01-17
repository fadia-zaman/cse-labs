public class taxAmount{
  public static void main ( String[]  args){
    int p=30000;
    int age=25;
    if(age>18){
      if(p<10000){
        System.out.println("Your tax amounts is 0 Tk");
      }
      else if (p>=10000 && p<=20000){
        double tax= p*0.05;
        System.out.println("Your tax amount is"+ " " + tax + " " + "Tk");
      }
      else if (p>20000){
        double tax= p*0.1;
        System.out.println("Your tax amount is"+ " " + tax + " " + "Tk");
      }
    }
    else{
      System.out.println("Your tax amount is 0 Tk");
    }
  }
}