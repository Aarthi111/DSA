import java.util.*;
public class HorseTour{
    static int[] X = {2,1,-1,-2,-2,-1,1,2};
    static int[] Y = {1,2,2,1,-1,-2,-2,-1};
    static boolean tour(int[][]board, int count, int row,int col, int n){
        if(count == n*n+1){
            return true;
        }
        for(int i=0; i<n; i++){
            int x1 = row+X[i];
            int y1 = col+Y[i];
            if(x1>=0 && y1>=0 && x1<n && x1<n &&board[x1][y1]==0){
                board[x1][y1] =count;
                if(tour(board, count+1, x1, y1, n)){
                    return true;
                }
                board[x1][y1] = 0;
            }
        }
        return false;
    }
    static void print(int[][]board){
        for(int i=0;i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.printf("%2d ",board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int [][] board = new int[n][n];
        board[0][0]=1;
        if(tour(board,2,0,0,n)){
            print(board);
            return;
        }
        System.out.println();
    }
}