public class Task1 {
    public static Integer lowestCommonAncestor( BSTNode root, Integer x, Integer y ){
      
      if(x<root.elem && y<root.elem){
        return lowestCommonAncestor(root.left,x,y);
      }
      
      else if(x>root.elem && y>root.elem){
        return lowestCommonAncestor(root.right,x,y);
      }
      
      else{
        return root.elem;
      }

