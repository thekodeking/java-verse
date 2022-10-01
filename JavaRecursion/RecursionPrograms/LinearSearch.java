import java.util.ArrayList;

public class LinearSearch {
    public static int linearSearch(int[] arr,int index, int target){
        if(arr[index] == target)
        return index;

        if(index == arr.length-1)
        return -1;

        return linearSearch(arr, index+1, target);
    }

    public static ArrayList<Integer> arrayList(int[] arr, int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length-1)
        return list;

        if(arr[index] == target)
        list.add(index);

        ArrayList<Integer> ans =  arrayList(arr, target, index+1);
        list.addAll(ans);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,4,1,7,3};
        int target = 7;

        // System.out.println(linearSearch(arr,0,target));
        System.out.println(arrayList(arr,target,0));
        
    }
}
