package ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter #of elements in array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter target value : ");
        int target = sc.nextInt();
//        int[] result = findingPairs(arr, target);
        System.out.println(Arrays.toString(findingPairs(arr, target)));
    }
    public static int[] findingPairs(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("NO solution found !");
    }

}
