import java.util.ArrayList;

//coordinates of current position given find no. of ways to reach
//the rightmost corner as destination in 3*3 matrix index from 1
//The maze Problem
class PossiblePaths {
    public static void main(String[] args) {
        // int ans = possiblePaths(1, 1);
        // System.out.println(ans);

        // printPaths(1, 1, "");

        // ArrayList<String> arr = printPathsInArray(1, 1, "");
        // System.out.println(arr);

        ArrayList<String> arr = canGoDiagonal(1, 1, "");
        System.out.println(arr);

    }

    static int possiblePaths(int row, int col) {
        if (row == 3 || col == 3) {
            return 1;
        }
        return possiblePaths(row + 1, col) + possiblePaths(row, col + 1);
    }

    static void printPaths(int row, int col, String paths) {
        if (row == 3 && col == 3) {
            System.out.println(paths);
            return ;
        }
        if (col < 3) {
           printPaths(row, col + 1, paths + "D");
        }

        if (row < 3) {
            printPaths(row + 1, col, paths + "R");
        }
    }

    static ArrayList<String> printPathsInArray(int row, int col, String paths) {
        if (row == 3 && col == 3) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(paths);
            return arr;
        }

        ArrayList<String> temp = new ArrayList<>();
        if (col < 3) {
           temp.addAll(printPathsInArray(row, col + 1, paths + "R"));
        }

        if (row < 3) {
            temp.addAll(printPathsInArray(row + 1, col, paths + "D"));
        }
        return temp;
    }

    static ArrayList<String> canGoDiagonal(int row, int col, String paths){
        if(row==3 && col==3){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(paths);
            return arr;
        }

        ArrayList<String> temp = new ArrayList<>();
        if(row<3){
            temp.addAll(canGoDiagonal(row+1, col, paths+"V"));
        } 

        if(col < 3){
            temp.addAll(canGoDiagonal(row, col+1, paths+"H"));
        }

        if(row<3 && col<3){
            temp.addAll(canGoDiagonal(row+1, col+1, paths+"D"));
        }
        return temp;
    }
}
