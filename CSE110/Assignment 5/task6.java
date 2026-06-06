import java.util.Scanner;
public class task6{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.nextLine();
    String output="";
    String word="";
    for(int i=(str.length()-1);i>=0;i--){
      char chr=str.charAt(i);
      if(chr!=' '){
        word=chr+word;
      }
      else{
        if(word.length()>0){
          output=output+word+" ";
          word="";
        }
      }
    }
    if(word.length()>0){
        output=output+word;
      }
    System.out.println(output);
  }
}
         