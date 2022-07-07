package Backtracing;

import java.util.Arrays;

public class NQueen {
    void print(char[][] board){
        System.out.println("Solution of N Queen");
        System.out.println();
        for (char[] ints : board) {
            for (char anInt : ints) {
                System.out.print(" "+anInt + " ");
            }
            System.out.println();
        }
    }
    boolean isSafe(char[][] board,int row, int col){
        int i,j;
        //row
        for(i=0;i<col;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        //upper diagonal
        for( i=row,j=col ;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //lower diagonal
        for( i=row,j=col ;j>=0 && i<board.length;i++,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    boolean nQueen(char[][] board,int col){
        if(col>=board[0].length){
            return true;
        }
        for(int i=0;i<board.length;i++){
            if(isSafe(board,i,col)){
                board[i][col]='Q';
                if(nQueen(board,col+1)){
                    return true;
                }
                board[i][col]='-';
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("N Queen Problem");
        NQueen n = new NQueen();
        char[][] board = new char[8][8];
        for(int i=0;i<board.length;i++){
            Arrays.fill(board[i], '-');
        }
        if(n.nQueen(board,0)){
            n.print(board);
        }else{
            System.out.println("no solution");
        }
    }
}
