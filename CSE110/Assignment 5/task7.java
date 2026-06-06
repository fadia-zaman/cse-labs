import java.util.Scanner;
public class task7{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str1=sc.nextLine();
    System.out.println("Enter another string:");
    String str2=sc.nextLine();
    for(int i=0;i<str1.length();i++){
      boolean flag1=false;
      char chr1=str1.charAt(i);
      for(int j=0;j<str2.length();j++){
        char chr2=str2.charAt(j);
        if(chr1==chr2){
          flag1=true;
          break;
        }
      }
      if(flag1==false){
        char output1=(char)(((int)chr1)-32);
        System.out.print(output1);
      }
    }
    for(int a=0;a<str2.length();a++){
      boolean flag2=false;
      char chr2=str2.charAt(a);
      for(int b=0;b<str1.length();b++){
        char chr3=str1.charAt(b);
        if(chr2==chr3){
          flag2=true;
          break;
        }
      }
      if(flag2==false){
        char output2=(char)(((int)chr2)-32);
        System.out.print(output2);
      }
    }
  }
}
      