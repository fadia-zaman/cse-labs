import java.util.Scanner;
public class task9{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a password: ");
    String pass=sc.nextLine();
    if (pass.length()<8){
      System.out.println("False");
            return;
    }
    boolean upper=false;
    boolean lower=false;
    boolean digit=false;
    boolean special_character = false;
    for(int i=0;i<=(pass.length()-1);i++){
    char chr=pass.charAt(i);
    if (chr>=65&&chr<=90){
      upper=true;
    }
            
    else if(chr>=97&&chr<=122){
      lower=true;
    }
    else if(chr>=48&&chr<=57){
      digit=true;
    }
    else{
     special_character = true;
    }
    }
    if(upper && lower && digit && special_character){
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }
  }
}
        
    