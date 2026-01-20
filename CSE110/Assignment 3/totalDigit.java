public class totalDigit{
  public static void main(String[] args){
    int n=75846;
    int count=0;
    for(int i=n;i!=0;i=i/10){
      count=count+1;
    }
    for(int i=n;i==0;){
      count=1;
    }
    System.out.print("Total digit:"+count);
  }
}
