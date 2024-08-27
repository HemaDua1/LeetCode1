import java.util.Scanner;

public class Quick_sort{
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
        boolean board[][]=new boolean[n][n];
         int c[]=new int[1];
         print(board,c,n,0);
         System.out.println(c[0]);
            }
        
        //     public static void print(boolean[][]  board, int q,int[] c,int qp,int i,int j) {
        //  if(qp==q) {
        // c[0]++;
        //  return;
        // }
        //     for(;i<board.length;i++) {
        //         for(;j<board[0].length;j++){
        //         if(board[i][j]!=true) {
        //             board[i][j]=true;
        //         print(board,q,c,qp+1,i+1,j+1);
        //         board[i][j]=false;
        //         }
        //     }
        //     }
        //     }
        // }

        
            private static void print(boolean[][] board,int[] c ,int n, int row) {
                if (row == n) {
                    c[0]++;
                    return;
                }
        
                for (int col = 0; col < n; col++) {
                    if (isValid(board, row, col)) {
                        board[row][col] = true;
                        print(board, c,n, row + 1);
                        board[row][col] = false;
                    }
                }
            }
        
            private static  boolean isValid(boolean[][] board, int row, int col) {
                for (int i = 0; i < row; i++) {
                    if (board[i][col] == true)
                        return false;
                    if (col - row + i >= 0 && board[i][col - row + i] == true)
                        return false;
                    if (col + row - i < board.length && board[i][col + row - i] == true)
                        return false;
                }
                return true;
            }
        }