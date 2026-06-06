import java.util.Scanner;
public class task8{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a string: ");
     String str=sc.nextLine();
     String output="";
     boolean flag=false;
     for(int i=0;i<=(str.length()-1);i++){
       char chr=str.charAt(i);
       if((chr>=65&&chr<=90)||(chr>=97&&chr<=122)){
         if(flag){
           if(chr>=97&&chr<=122){
              chr=(char)(chr-32);
           }
             output+=chr;
                } 
         else{
           if(chr>=65&&chr<=90){
             chr=(char)(chr+32);
           }
           output+=chr;
         }
         flag=!flag;
       }
       else{
         output+=chr;
     }
     }
       System.out.println(output);
  }
}