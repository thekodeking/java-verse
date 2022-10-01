import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        helper(arr, arr.length, 0, 0);
    }

    public static void helper(int[] arr, int r, int c, int max) {
        if (r == 0)
            return;

        if (c < r) {
            if ( arr[c] > arr[max]) {
                helper(arr, r, c+1, c);
            } else {
                helper(arr, r, ++c, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            helper(arr, --r, 0, 0);
        }
        
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 1, 0 };
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
