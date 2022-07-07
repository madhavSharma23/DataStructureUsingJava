package Backtracing;

import java.util.Arrays;

public class NKnight {
    void print(int[][] board) {
        System.out.println("Solution of N knight");
        System.out.println();
        for (int[] ints : board) {
            for (int anInt : ints) {
                String s = String.format("%02d", anInt);
                System.out.print("  " + s);
            }
            System.out.println();
        }
    }

    boolean isSafe(int[][] board, int row, int col) {
        return (row >= 0 && row < board.length && col >= 0 && col < board.length && board[row][col] == -1);
    }

    int[] x = {2, 1, -1, -2, -2, -1, 1, 2};
    int[] y = {1, 2, 2, 1, -1, -2, -2, -1};

    boolean nKnight(int[][] board, int row, int col, int move) {
        if (move == board.length * board.length) {
            return true;
        }
        for (int i = 0; i < x.length; i++) {
            int next_col = col + x[i];
            int next_row = row + y[i];
            if (isSafe(board, next_row, next_col)) {
                board[next_row][next_col] = move;
                if (nKnight(board, next_row, next_col, move + 1)) {
                    return true;
                } else {
                    board[next_row][next_col] = -1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        NKnight n = new NKnight();
        int[][] board = new int[8][8];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], -1);
        }
        board[0][0] = 0;
        if (n.nKnight(board, 0, 0, 1)) {
            n.print(board);
        } else {
            System.out.println("No Solution");
        }
    }
}
