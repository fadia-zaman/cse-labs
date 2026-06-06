import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.nextLine();
        String output="";
        for (int i=0;i<=(str.length()-1)/2;i++) {
            if(str.charAt(i)==str.charAt(str.length()-1-i)) {
             output="True";
            }
            else{
              output="False";
            }
        }
        System.out.println(output);
    }
}