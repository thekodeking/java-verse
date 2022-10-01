package ArraysInJava;

import java.util.Arrays;

public class CreatingArray {
    public static void main(String[] args) {
        int[] intArray;        //Declaration
        intArray = new int[5]; //instantiation
        intArray[0] = 5;        //initialization
        System.out.println(Arrays.toString(intArray));


        //All three steps together
        int[] allArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(allArray));

    }
}
