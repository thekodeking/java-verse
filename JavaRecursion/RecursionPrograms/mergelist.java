import java.util.Arrays;
public class mergelist {
    static int[] temp=new int[5];
    public static void merge(int[] arr, int low, int mid, int high) {
        int i = low, j = mid + 1;
        int k = low;
        if (low < high) {
            while (i <= mid && j <= high) {
                if (arr[i] < arr[j]) {
                    temp[k] = arr[i];
                    k++;
                    i++;
                    System.out.println(Arrays.toString(temp));
                } else {
                    temp[k] = arr[j];
                    k++;
                    j++;
                    System.out.println(Arrays.toString(temp));
                }
            }
            if (i > mid) {
                while (j <= high) {
                    temp[k] = arr[j];
                    k++;
                    j++;
                    System.out.println(Arrays.toString(temp));
                }
            }
    
            if (i <= mid) {
                while (i <= mid) {
                    temp[k] = arr[i];
                    k++;
                    i++;
                    System.out.println(Arrays.toString(temp));
                }
    
            }
        }

        

        for (int t = low; t <= high; t++) {
            arr[t] = temp[t];
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,0,3};
        merge(arr,0,2,4);
    }
}
