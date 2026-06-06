import java.util.Scanner;
public class task10{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("RULES-");
    System.out.println("1.Finish the game within 10 move");
    System.out.println("2.If you move out of the grid GAME OVER");
    System.out.println("3.If you step on mine(-1) GAME OVER");
    System.out.println("Good Luck finding the Treasure(10)");
    System.out.println("Write 'left' to go left, 'right' to go right, 'up' to go up and 'down' to go down");
    System.out.println("REMINDER: you are 7");
    int [][] arr2D = {{0, 0, -1, 0, -1, -1,0,0,10,-1},
                      {0, -1, 0, -1, -1,0,0,0,0,-1},
                      {-1, 0, -1, 0, 0,-1,0,-1,0,0},
                      {0, -1,-1 , -1, 0,0,0,-1,0,-1},
                      {0, -1, 0, 7, 0,0,-1,-1,0,0}};
    System.out.println("Initial Map:");
    printMap(arr2D);
    int row = arr2D.length;
    int col = arr2D[0].length;
    int row_pos = -1, col_pos = -1;
    
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        if(arr2D[i][j]==7){
          row_pos=i;
          col_pos=j;
          break;
        }
      }
    }
      
    int turns = 10;
    while (turns > 0) {
      int new_row = row_pos,new_col = col_pos;
      System.out.printf("Enter move %d: ",(11-turns));
      String inp = sc.nextLine();
      
      inp=inp.toUpperCase();
      if(inp.equals("UP")){
        new_row-=1;
      }
      else if(inp.equals("DOWN")){
        new_row+=1;
      }
      else if(inp.equals("LEFT")){
        new_col-=1;
      }
      else if(inp.equals("RIGHT")){
        new_col+=1;
      }
      
      if(new_row<0||new_col<0||new_row>=row||new_col>=col){
        System.out.println("Game Over!");
        return;
      }
      
      if(arr2D[new_row][new_col]==-1){
        System.out.println("Stepped on mine,Game Over!");
        return;
      }
      
      if(arr2D[new_row][new_col]==10){
        System.out.println("Congratulations! Treasure found");
        return;
      }
      
      arr2D[row_pos][col_pos] = 0;
      arr2D[new_row][new_col] = 7;
      
      row_pos=new_row;
      col_pos=new_col;
      
      System.out.println("Current state:");
      printMap(arr2D);
      turns--;
    }
    if (turns == 0) {
      System.out.println("Failed to find the treasure.");
    }
  }
  
  public static void printMap(int[][] arr) { 
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
  }
