
import java.util.Arrays;

public class SumTraingle {
    
    public static void sumTraingle(int []arr){
        
        if(arr.length < 2)
        return;

        int[] ans = new int[arr.length-1];

        for(int i=0;i<arr.length-1;i++){
            int x = arr[i]+arr[i+1];
            ans[i] = x;
        }
        sumTraingle(ans);
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        sumTraingle(arr);
        System.out.println(Arrays.toString(arr));
    }
}
