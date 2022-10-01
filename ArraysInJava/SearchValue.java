package ArraysInJava;

import java.util.Scanner;

public class SearchValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter #of elements : ");
        int size = sc.nextInt();

        int []arr = new int[size];
        System.out.println("Enter array elements : ");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

//        System.out.print("Enter value to search : ");
//        int valueToSearch = sc.nextInt();
//        System.out.println("Value found at index : "+searchingValue(arr,valueToSearch));


//        System.out.println("Max Product of array Is : "+maxProduct(arr));
        System.out.println("Arrays is Unique : "+isUnique(arr));
    }
//    public static int searchingValue(int[] arr,int valueToSearch){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == valueToSearch)
//                return i;
//        }
//        return -1;
//    }

//    public static String maxProduct(int[] arr){
//        int maxValue = 0;
//        String pairs = "";
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if(maxValue < (arr[i]*arr[j])) {
//                    maxValue = (arr[i] * arr[j]);
//                    pairs =arr[i]+" , "+arr[j];
//                }
//            }
//        }
//        return pairs;
//    }

    public static Boolean isUnique(int[] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j])
                    return false;
            }
        }
        return true;
    }

}
