import java.io.*;

public class MergeSort {

    public static void main(String[] args) throws IOException{
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(R.readLine());
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = Integer.parseInt(R.readLine());
        }
        sort(inputArray);

        for (int j = 0; j < inputArray.length; j++) {
            System.out.print(inputArray[j] + " ");
        }

    }

    public static void sort(int[] in){
    if(in.length <2) return; //do not need to sort
    int mid = in.length/2;
    int left[] = new int[mid];
    int right[] = new int[in.length-mid];
    for(int i=0; i<mid; i++){ //copy left
        left[i] = in[i];
    }
    for(int i=0; i<in.length-mid; i++){ //copy right
        right[i] = in[mid+i];
    }
    sort(left);
    sort(right);
    merge(left, right, in);
}

private static void merge(int[] a, int[] b, int[] all){
    int i=0, j=0, k=0;
    while(i<a.length && j<b.length){ //merge back
        if(a[i] < b[j]){
            all[k] = a[i];
            i++;
        }else{
            all[k] = b[j];
            j++;
        }
        k++;
    }
    while(i<a.length){ //left remaining
        all[k++] = a[i++];
    }
    while(j<b.length){ //right remaining
        all[k++] = b[j++];
    }
}

}