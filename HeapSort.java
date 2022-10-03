import java.util.*;

public class HeapSort {
    public void sort(int arr[]) //this is the function where the operation occurs
    {
        int n = arr.length;     
 
        for (int i = n/2-1; i >= 0; i--)  
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) //after removing the top element the tree again changes to create max heap 
    {
        int largest = i; 
        int l = 2 * i + 1; //left child
        int r = 2 * i + 2; //right child
 
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            heapify(arr, n, largest);
        }
    }
 
    static void printArray(int arr[]) //printing the array
    {
        int n = arr.length;
 
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of elements: ");
		int n = sc.nextInt();
        int[] arr = new int[n];
		System.out.print("Enter the elements: ");
		for(int i =0;i<n;i++)
		{
			int temp = sc.nextInt();
			arr[i] = temp;
		}
 
        HeapSort ob = new HeapSort();
        ob.sort(arr);
 
        System.out.println("Sorted array is");
        printArray(arr);
    }
}