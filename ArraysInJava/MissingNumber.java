package ArraysInJava;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the #of elements in missingArray : ");
        int missNum = sc.nextInt();
        int[] arr  = new int[missNum];
        int sum = 0;

        System.out.println("Enter the missingArray elements : ");
        for (int i=0;i<missNum-1;i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        int totalSum = (missNum*(missNum+1))/2;
        System.out.println("Missing Number is : "+(totalSum-sum));

    }
}
