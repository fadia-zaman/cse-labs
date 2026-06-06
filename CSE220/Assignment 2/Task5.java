// Complete the subtractSummation method
//ASSIGNMENT TASK MUST SUBMIT
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer subtractSummation( BTNode root ){
      int biyog=0;
      
       if(root==null){
         return 0;
       }
    
       biyog=sumlr(root.left)-sumlr(root.right);
       return biyog;
    }
       
    private static Integer sumlr(BTNode side){
      int jog=0;
      if(side==null){
        return 0;
      }
      
      jog=(int)side.elem+sumlr(side.left)+sumlr(side.right);
      return jog;
    }

       
    //============================================================================
}

