import java.util.Scanner;

public class TicTacToe{
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Let's play tic tac toe");
        char[][] board= {{'_','_','_'},{'_','_','_'},{'_','_','_'}};

        printBoard(board);

        int turns = 9;
        for(int i=0;i<turns;i++){
            if(i%2==0){      
                System.out.print("Turn: X ");
                int[] spot= asksUser(board);
                board[spot[0]][spot[1]]='X';
            }else{
                System.out.print("Turn: O ");
                int[] spot=asksUser(board);
                board[spot[0]][spot[1]]='O';
            }
            printBoard(board);

          int count= checkWin(board);
          if(count==3){
              System.out.println("X won");
              break;
          }else if(count==-3){
              System.out.println("O wind");
              break;
          }
        }
    }

    public static void printBoard(char[][] board){
        for(int i=0;i<board.length;i++){
            System.out.println("\t");
            for(int j=0;j<board[0].length;j++){
                // System.out.println(board[spot[0]][spot[1]]);
                System.out.print(board[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    public static int[] asksUser(char[][] board){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick row and column number ");
        int row = scan.nextInt();
        int column = scan.nextInt();
        while(board[row][column] == 'X' || board[row][column]=='O'){
            System.out.print("The spot is taked please try again ");
            row = scan.nextInt();
            column = scan.nextInt();
        }
        // scan.close();
        return new int[] {row,column};
    }
    public static int checkWin(char[][] board){
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='X'){
                    count++;
                }else if(board[i][j] == 'O'){
                    count--;
                }
            }

            if(count==3 || count==-3){
                return count;
            }else{
                count=0;
            }

        }
        for(int i=0;i<3;i++){
            for(int j=0;j<board.length;j++){
                if(board[j][i] == 'X'){
                    count++;
                }else if(board[j][i] == 'O'){
                    count--;
                }
            }
            if(count == 3|| count == -3){
                return count;
            }else{
                count=0;
            }
        }

        for(int i=0;i<3;i++){
            if(board[i][i] == 'X'){
                count++;
            }else if(board[i][i] == 'O'){
                count--;
            }
        }
        if(count == 3|| count == -3){
            return count;
        }else{
            count=0;
        }

        for(int i=0;i<3;i++){
            int rowIndex= 2-i;
            if(board[rowIndex][i] == 'X'){
                count++;
            }else if(board[rowIndex][i]=='O'){
                count--;
            }
        }

        return count;
    }
}
