package Backtracing;

import java.util.ArrayList;
import java.util.Stack;

public class SudukoSolver {
    boolean solveSuduko(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==0){
                    for(int k=1;k<=9;k++){
                        if(isSafe(board,i,j,k)){
                            board[i][j]=k;
                            if(solveSuduko(board)){
                                return true;
                            }
                            board[i][j]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isSafe(int[][] board, int i, int j, int k) {
        for(int l=0;l<9;l++){
            if(board[i][l]==k || board[l][j]==k || board[3*(i/3)+l/3][3*(j/3)+l%3]==k){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] suduko = {
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0}
        };
        SudukoSolver s = new SudukoSolver();
        if(s.solveSuduko(suduko)){
            print(suduko);
        }else{
            System.out.println("No solution");
        }
    }

    private static void print(int[][] suduko) {
        for (int i =0;i< suduko.length;i++) {
            for (int j = 0; j < suduko.length; j++) {
                if(j%3==0){
                    System.out.print("  ");
                }
                System.out.print(" " + suduko[i][j]);
            }
            System.out.println();
            if((i+1)%3==0){
                System.out.println();
            }
        }
    }
}
