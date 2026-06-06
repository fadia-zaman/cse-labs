public class T4{
 public static void main(String args[]){
 boolean check = true;
 int x = 2, y = 2, z = 3;
 while(check){
 y = 4 / x % 3 + z * y - 5;
 if(y > 10 || x==7){
 z += 3;
 break;
 }
 if(4+x%3 > 5){
 x %= y + (z--) + z;
 System.out.println(x);
 }
 else{
 y += x + (--z) + y;
 System.out.println(y);
 }
 x++;
 System.out.println(x + y);
 }
 }
}
 