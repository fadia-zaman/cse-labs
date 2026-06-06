import java.util.Scanner;
public class task5{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter phrase: ");
      String phr=sc.nextLine();
      int vowel=0;
      int cons=0;
      for(int i=0;i<=(phr.length()-1);i++){
         char chr=phr.charAt(i);
       if((chr>=65&&chr<=90)||(chr>=97&&chr<=122)){
       if(chr==65||chr==69||chr==73||chr==79||chr==85||chr==97||chr==101||chr==105||chr==111||chr== 117){
        vowel++;
      }
      else{
         cons++;
      }
     }
    }
    if(vowel>0&&cons>0&&vowel%3==0&&cons%5==0){
      System.out.println("Aaarr! Me Plunder!!");
    }
   else{
     System.out.println("Blimey! No Plunder!!");
   }
 }
}
    

