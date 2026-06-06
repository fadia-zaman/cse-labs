// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {
 public static int k=0;
    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
      int jog=0;
   
      
      if(root==null){
        return 0;
      }
      
      if(k%2==0){
      
      jog= -(int)root.elem;
     
      }
      
      else{
        jog=(int)root.elem;
    
      }
      
      
      k++;
      jog+=levelSum(root.left);
       jog+= levelSum(root.right);
        k--;
        return jog;
    }
    //============================================================================

}
