import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        helper(arr,arr.length-1,0);
    }

    public static void helper(int[] arr, int r, int c){
        if(r == 0)
        return;

        if(c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            helper(arr, r, ++c);
        } 
            helper(arr,--r, 0);
        
    }
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,0};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
