import java.util.Scanner;
public class task3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("Enter a character: ");
        String chr=sc.nextLine();
        char split=chr.charAt(0);
        String output="";
        for(int i=0;i<=(str.length()-1);i++){
            char new_char=str.charAt(i);
            if (new_char==split){
                System.out.println(output);
                 output="";
            } 
            else {
                output+=new_char;
            }
        }
        System.out.println(output);
    }
}

