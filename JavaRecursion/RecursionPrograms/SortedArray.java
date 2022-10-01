public class SortedArray {
    public static boolean helper(int []arr, int index){
        if(index == arr.length-1)
        return true;

        return arr[index]<arr[index+1] && helper(arr, index+1);
    }

    public static boolean sortedArray(int []arr){
        return helper(arr,0);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7};
        System.out.println(sortedArray(arr)); 
    }
}
