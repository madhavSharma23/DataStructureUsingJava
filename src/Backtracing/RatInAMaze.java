package Backtracing;

import java.io.IOException;

public class RatInAMaze {
    void print(int[][] maze) {
        for (int[] i : maze) {
            for (int j : i) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    boolean isSafe(int[][] maze, int[][] sol, int x, int y) {
        //return sol[x][y] == 0 && maze[x][y] == 1 && y < maze.length && x>=0 && x< maze.length;
        if(x>=0 && x<maze.length && y>=0 && y< maze.length && maze[x][y]==1 && sol[x][y]==0 ){
            return true;
        }else{
            return false;
        }
    }

    boolean ratInMat(int[][] maze, int x, int y, int[][] sol) {
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(maze, sol, x, y)) {
            if (sol[x][y] == 1) {
                return false;
            }
            sol[x][y]=1;
            if (ratInMat(maze, x + 1, y, sol)) {
                return true;
            }
            if (ratInMat(maze, x, y + 1, sol)) {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        int[][] maze = {
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,1,1,0,0},
                {1,1,1,1,1}
                        };
        int[][] sol = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        RatInAMaze rat = new RatInAMaze();
        if(rat.ratInMat(maze,0,0,sol)){
            rat.print(sol);
        }else{
            System.out.println("No Solution");
        }
    }
}
