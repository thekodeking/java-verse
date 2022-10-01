package ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

class TwoDArray{
    int[][] arr;
    public TwoDArray(int row,int col){
        this.arr = new int[row][col];
        for(row =0;row<arr.length;row++){
            for(col=0;col<arr[row].length;col++)
                arr[row][col] = Integer.MIN_VALUE;
        }
    }

    //inserting in 2d array
    public void insertingElement(int row,int col,int value){
        try{
            if(arr[row][col]==Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("Successfully Inserted !");
            }
            else
                System.out.println("The Array cell isOccupied !");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index ! "+e);
        }
    }

    //accessing element from Array
    public void accessingElement(int rowIndex, int colIndex){
        try{
            System.out.println("Accessing #row "+rowIndex+" #col "+colIndex);
            System.out.println("cell value is "+arr[rowIndex][colIndex]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index Input !");
        }
    }

    //Traversing the 2D array
    public void traverseArray(){
        try{
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++)
                    System.out.print(arr[i][j]+" ");
                System.out.println();
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Not Found !");
        }
    }

    //Searching Element in Array
    public void searchingElement(int valueToSearch){
        int row,col;
        for(row=0;row<arr.length;row++){
            for (col=0;col<arr[row].length;col++){
                if(arr[row][col] == valueToSearch) {
                    System.out.println("Element found at Index : #row" + row + " #col" + col);
                    return;
                }
            }
        }
            System.out.println("Element is Not Found in Array !");
    }

    //Deleting Element From Array
    public void deletingElement(int row,int col){
        try{
            System.out.println(arr[row][col] + " Element Deleted Successfully");
            arr[row][col] = Integer.MIN_VALUE;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index for 2d Array !");
        }

    }
}
public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Cols in 2D Array ");
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();
        TwoDArray tda = new TwoDArray(rowSize, colSize);

        System.out.println("Enter Array Elements ");
        for(int i=0;i<rowSize;i++){
            for (int j=0;j<colSize;j++)
                tda.insertingElement(i,j,sc.nextInt());
        }

//        System.out.println(Arrays.deepToString(tda.arr));
//        tda.accessingElement(0,1);
//        tda.traverseArray();
//        tda.searchingElement(5);
        tda.deletingElement(0,0);
        tda.traverseArray();
    }
}
