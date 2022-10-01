package ArraysInJava;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter #of elements : ");
        int size = sc.nextInt();

        int []arr1 = new int[size];
        int sum1 = 0,mul1=1;
        System.out.println("Enter array1 elements : ");
        for(int i=0;i<size;i++) {
            arr1[i] = sc.nextInt();
            sum1 += arr1[i];
            mul1 *= arr1[i];
        }

        int []arr2 = new int[size];
        int sum2 = 0,mul2=1;
        System.out.println("Enter array1 elements : ");
        for(int i=0;i<size;i++) {
            arr2[i] = sc.nextInt();
            sum2 += arr2[i];
            mul2 *= arr2[i];
        }

        if((sum1==sum2) && (mul1==mul2))
            System.out.println("true");
        else
            System.out.println("False");
    }
}
