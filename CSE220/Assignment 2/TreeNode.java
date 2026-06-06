public class TreeNode{
  Object elem;
  TreeNode left;
  TreeNode right;
  
  public TreeNode(Object elem){
    this.elem=elem;
    this.left=left;
    this.right=right;
  }
  
  public static void main(String[] args){
    TreeNode n1=new TreeNode(10);
     TreeNode n2=new TreeNode(20);
      TreeNode n3=new TreeNode(70);
       TreeNode n4=new TreeNode(40);
        TreeNode n5=new TreeNode(60);
         TreeNode n6=new TreeNode(50);
         
         n1.left=n2;
         n1.right=n3;
         n2.left=n4;
         n2.right=n5;
         n3.right=n6;
           
         
         //System.out.println( n1.left );
         //System.out.println( n3.right.elem );
         //TreeNode x = n2.left;
         //System.out.println((int) n1.elem +(int) x.elem );
         //x = new TreeNode(80);
           //n3.left = x;
           //System.out.println(n1.right.left.elem);
         //System.out.println((int)n1.left.right.elem + (int)n5.left.elem);
         //n1.left.right.elem = 44;
         //System.out.println(n1.left.right.elem);
  }
}
    
  
    