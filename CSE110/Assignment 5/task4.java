import java.util.Scanner;
public class task4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        String output="";
        for (int i=(str.length()-1);i>=0;i--){
            output+=str.charAt(i);
        }
        System.out.println(output);
    }
}
