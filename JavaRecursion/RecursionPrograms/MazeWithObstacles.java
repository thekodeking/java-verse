import java.util.Arrays;

class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        // int ans = possiblePathsBacktracking(board, 0, 0, "");
        // System.out.println(ans);

        int [][] arr = new int[board.length][board[0].length];
        int ans = printPathsBacktracking(board,0,0,"",arr,1);
        System.out.println(ans);
    }

    static int possiblePaths(boolean[][] maze, int row, int col, String paths) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(paths);
            return 1;
        }

        if (!maze[row][col]) {
            return 0;
        }

        int count = 0;
        if (row < maze.length - 1) {
            count = count + possiblePaths(maze, row + 1, col, paths + "D");
        }

        if (col < maze[0].length - 1) {
            count = count + possiblePaths(maze, row, col + 1, paths + "R");
        }
        return count;
    }

    static int possiblePathsBacktracking(boolean[][] maze, int row, int col, String paths) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(paths);
            return 1;
        }

        if (!maze[row][col]) {
            return 0;
        }

        // these all paths being visiting during the one recursion call marking them
        // false
        maze[row][col] = false;
        int count = 0;

        if (row < maze.length - 1) {
            count = count + possiblePathsBacktracking(maze, row + 1, col, paths + "D");
        }

        if (col < maze[0].length - 1) {
            count = count + possiblePathsBacktracking(maze, row, col + 1, paths + "R");
        }

        if (row > 0) {
            count = count + possiblePathsBacktracking(maze, row - 1, col, paths + "U");
        }

        if (col > 0) {
            count = count + possiblePathsBacktracking(maze, row, col - 1, paths + "L");
        }

        // after these all function of one recursion call gets over, make matrix as it
        // was = make true
        maze[row][col] = true; // this line causes backtracking
        return count;

    }

    static int printPathsBacktracking(boolean[][] maze, int row, int col, String paths,int[][]arr, int steps) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            arr[row][col] = steps;
            for(int[] x: arr){
                System.out.println(Arrays.toString(x));
            }
            System.out.println(paths);
            System.out.println();
            return 1;
        }

        if (!maze[row][col]) {
            return 0;
        }

        // these all paths being visiting during the one recursion call marking them
        // false
        maze[row][col] = false;
        arr[row][col] = steps;
        int count = 0;

        if (row < maze.length - 1) {
            count = count + printPathsBacktracking(maze, row + 1, col, paths + "D",arr,steps+1);
        }

        if (col < maze[0].length - 1) {
            count = count + printPathsBacktracking(maze, row, col + 1, paths + "R",arr,steps+1);
        }

        if (row > 0) {
            count = count + printPathsBacktracking(maze, row - 1, col, paths + "U",arr,steps+1);
        }

        if (col > 0) {
            count = count + printPathsBacktracking(maze, row, col - 1, paths + "L",arr,steps+1);
        }

        // after these all function of one recursion call gets over, make matrix as it
        // was = make true
        maze[row][col] = true; // this line causes backtracking
        arr[row][col] = 0;
        return count;

    }
}
