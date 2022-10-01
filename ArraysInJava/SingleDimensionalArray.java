package ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

class ExampleArray{
    int[] arr;
    public ExampleArray(int sizeArray){
        arr = new int[sizeArray];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }

    public void inserting(int index, int value){
        try{
            if(arr[index]==Integer.MIN_VALUE) {
                arr[index] = value;
                System.out.println("Inserted Successfully !");
            }
            else
                System.out.println("The cell is Already Occupied !");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index is invalid !"+ e);
        }
    }

    public void traversal(int[] arr){
        try {
            System.out.println(Arrays.toString(arr));
        }
        catch (Exception e){
            System.out.println("Invalid Array Name !");
        }
    }

    public void searching(int valueToSearch){
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==valueToSearch)
                System.out.println("Value found at index "+i);
        }
        if(i==arr.length)
            System.out.println("Value Not Found !");
    }

    public void deleting(int valueToDeleteIndex){
        try{
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("Element Deleted Successfully !");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index "+valueToDeleteIndex+" is out of Range !");
        }
    }
}

public class SingleDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        ExampleArray sda = new ExampleArray(size);

        for(int i=0;i<size;i++){
            System.out.println("Enter index and value to insert ");
            sda.inserting(sc.nextInt(),sc.nextInt());
            //        sda.inserting(0,4);
        }

        sda.traversal(sda.arr);
//        System.out.println("Enter value to Search ");
//        int value = sc.nextInt();
//        sda.searching(value);

        System.out.println("Enter index to Delete ");
        sda.deleting(sc.nextInt());
        sda.traversal(sda.arr);

    }
}
