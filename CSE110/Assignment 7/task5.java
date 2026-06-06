public class task5{
  public static void showDots(int nmr){
    for(int i=0;i<nmr;i++){
      System.out.print(".");
    }
  }
  
  public static void  show_palindrome(int nmr){
    for(int i=1;i<=nmr;i++){
      System.out.print(i);
    }
    for(int i=nmr-1;i>=1;i--){
      System.out.print(i);
    }
  }
  
  public static void showDiamond(int nmr){
    for(int i=1;i<=nmr;i++){
      showDots(nmr-i);
      show_palindrome(i);
      showDots(nmr-i);
      System.out.println();
    }
    for(int i=nmr-1;i>=1;i--){
      showDots(nmr-i);
      show_palindrome(i);
      showDots(nmr-i);
      System.out.println();
    }
  }
  
    public static void main(String[] args){
      showDots(5);
      System.out.println();
      
      show_palindrome(5);
      System.out.println();
      
      showDiamond(5);
    }
  }