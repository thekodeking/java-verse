import java.util.Arrays;

public class MergeSort {
    static int[] temp = new int[6];

    public static void mergesort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int i = low, j = mid + 1;
        int k = low;
        if (low < high) {
            while (i <= mid && j <= high) {
                if (arr[i] < arr[j]) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                }
            }
            if (i > mid) {
                while (j <= high) {
                    temp[k++] = arr[j++];
                }
            }

            if (i <= mid) {
                while (i <= mid) {
                    temp[k++] = arr[i++];
                }

            }
        }

        for (int t = low; t <= high; t++) {
            arr[t] = temp[t];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 9, 1, 5, 3, 4 };
        System.out.println(Arrays.toString(arr));
        mergesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
