public class returnedChange{
  public static void main ( String[]  args){
        int c=500;
        int p=500;
        int change = p-c;
        if (change==0){
          System.out.println("The returned amount is 0 taka");
        }
        else if (change>0){
        System.out.println("The returned amount is"+" "+change+" "+"taka");
        int hundred_note=change/100;
        int remain = change - hundred_note*100;
        int fifty_note=remain/50;
        remain= remain-fifty_note*50;
        int twenty_note=remain/20;
        remain= remain-twenty_note*20;
        int ten_note=remain/10;
        remain= remain - ten_note*10;
        int five_coin=remain/5;
        remain= remain - five_coin*5;
        int two_coin= remain/2;
        remain = remain - two_coin*2;
        int one_coin=remain;
        System.out.println("100 taka note:  "+hundred_note);
        System.out.println("50 taka note:  "+fifty_note);
        System.out.println("20 taka note:  "+twenty_note);
        System.out.println("10 taka note:  "+ten_note);
        System.out.println("5 taka coin:  "+five_coin);
        System.out.println("2 taka coin:  "+two_coin);
        System.out.println("1 taka coin:  "+one_coin);
  }
        else{
          System.out.println("Please pay" +" "+(c-p)+ " "+"more taka");
        }
  }
}