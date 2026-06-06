public class task9{
  public static void main(String[] args){
    int[][] mat={{1,0,0},
                 {0,1,0},
                 {0,0,1},
                 };
    
    boolean idn=false;
    
    for(int i=0;i<mat.length;i++){
      for(int j=0;j<mat.length;j++){
        if(i==j){
          if(mat[i][j]!=1){
            idn=true;
            break;
          }
        }
        
        else{
          if(mat[i][j]!=0){
            idn=true;
            break;
          }
        }
      }
    }
    
    if(idn==true){
      System.out.println("Not an identity matrix");
    }
    
    else{
      System.out.println("identity matrix");
    }
  }
}

      
      
    
    