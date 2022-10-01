package Big_O;

import java.util.Scanner;

public class PrintPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();

        System.out.println("Enter array elements : ");
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        printPairs(a,n);
    }
    static void printPairs(int[] a,int size){
        for(int i=0;i<size;i++){              //-> O(N)
            for(int j=0;j<size;j++)           //-> O(N)
                System.out.print(a[i]+""+a[j]+" ");
            System.out.println();
        }
        //Time complexity -------> O(N^2)
    }
}
