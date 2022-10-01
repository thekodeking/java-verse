package ArraysInJava;

import java.util.Arrays;

public class Creating2DArray {
    public static void main(String[] args) {
        int [][] int2dArray;  //declaration
        int2dArray = new int[2][2];  //instantiation
        int2dArray[0][0] = 1;
        int2dArray[0][1] = 2;  //initialization  ---> O(mn): Space Complexity
        int2dArray[1][0] = 3;
        int2dArray[1][1] = 3;

        System.out.println(Arrays.deepToString(int2dArray));  //printing 2d array

        String[][] s2dArray = {{"a","b"},{"c","d"}}; // all together --> O(1) : Time complexity
        System.out.println(Arrays.deepToString(s2dArray));
    }
}
