package Big_O;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();

        System.out.println("Enter array elements : ");
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        reversedArray(a,n);
    }
    static void reversedArray(int[] a,int n){
        for(int i=0;i<=n/2;i++){    //--->O(N/2)
            int temp = a[i];
            int temp1 = n-1-i;      // other all --->O(1)
            a[i] = a[temp1];
            a[temp1] = temp;
        }
        for (int i=0;i<n;i++)
            System.out.println(a[i]);
        // Time complexity is ------> O(N)
        }


}
