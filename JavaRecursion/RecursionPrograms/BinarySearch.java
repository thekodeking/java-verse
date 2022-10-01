public class BinarySearch {
    public static boolean binarySearch(int []arr, int target){
        return helper(arr,target,0,arr.length-1);
    }

    public static boolean helper(int []arr, int target,int low, int high){
        if(low > high)
        return false;

        int mid = (low+high)/2;
        if(arr[mid] == target)
        return true;

        if(target > arr[mid])
        return helper(arr, target, mid+1, high);
        else {
            return helper(arr, target, low, mid-1);
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {2,7,4,1,5,3};
        int target = 9;

        System.out.println(binarySearch(arr,target));
    }
}
