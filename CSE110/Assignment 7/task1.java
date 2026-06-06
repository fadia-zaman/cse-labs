public class task1{
  public static void evenChecker(int nmbrA){
    if (nmbrA%2==0){
      System.out.println("Even!!");
    }
    else{
      System.out.println("Odd!!");
    }
  }
  
  public static boolean isEven(int nmbrB){
    if(nmbrB%2==0){
      return true;
    }
    else{
      return false;
    }
  }
  
  public static boolean isPos(int nmbrC){
    if(nmbrC>0){
      return true;
    }
    else{
      return false;
    }
  }
  
  public static void sequence(int n){
    if(isPos(n)){
      for(int i=0;i<=n;i++){
        if(isEven(i)){
          System.out.print(i+" ");
        }
      }
    }
      else{
        for(int i=n;i<0;i++){
          if(!isEven(i)){
            System.out.print(i+" ");
          }
        }
      }
  }

  public static void main(String[] args){
    evenChecker(10);
    evenChecker(17);
    
    boolean ans=isEven(15);
    System.out.println(ans);
    
    boolean result=isPos(18);
    System.out.println(result);
    
    sequence(-8);
  }
}
