import java.util.Scanner;
public class task3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    String str2=sc.next();
    
    String con_str=str1+" "+str2;
    System.out.println(con_str);
    
    int num=0;
    
    for(int i=0;i<con_str.length();i++){
      char ascii_str=con_str.charAt(i);
      if(ascii_str>='A' && ascii_str<='Z'|| ascii_str>='a' && ascii_str<='z'){
       num+=(int)ascii_str;
      }
  }
    
    System.out.println(num);
  }
}
