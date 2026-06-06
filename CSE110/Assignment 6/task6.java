import java.util.Scanner;
public class task6{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the array:");
    int N=sc.nextInt();
    double[] array=new double[N];
    for(int i=0;i<N;i++){
      System.out.println("Enter a number:");
      array[i]=sc.nextDouble();
    }
    double max=array[0];
    int index1=0;
    for(int i=0;i<N;i++){
      if(array[i]>max){
        max=array[i];
        index1=i;
      }
    }
    System.out.println("Maximum element"+" "+max+" "+"found at index"+" "+index1+" ");
    double min=array[0];
    int index2=0;
    for(int i=0;i<N;i++){
      if(array[i]<min){
        min=array[i];
        index2=i;
      }
    }
    System.out.println("Minimum element"+" "+min+" "+"found at index"+" "+index2+" ");
    double sum=0;
    for(int i=0;i<N;i++){
      sum+=array[i];
    }
    System.out.println("Summation:"+sum);
    double avg=sum/N;
    System.out.println("Average:"+avg);
  }
}
