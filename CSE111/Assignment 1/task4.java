import java.util.Scanner;
public class task4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    String str2=" ";
    
    for(int i=0;i<str1.length();i++){
      char asc_str=str1.charAt(i);
      char pre_str;
      if(asc_str=='a'){
        pre_str='z';
      }
      
      else{
        pre_str=(char)(asc_str-1);
      }
      
        System.out.print(pre_str);
    }
  }
}