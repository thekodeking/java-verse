import java.util.Scanner;               //To get command line input from users

public class HeapSort {
    public void sort(int arr[])         //Function where sorting occurs 
    {
        int n = arr.length;             //n denotes the length of the array     
 
        for (int i = n/2-1; i >= 0; i--)  
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            heapify(arr, i, 0);              //To make the array into max heap
        }
    }

    void heapify(int arr[], int n, int i)    //Function for creating max heap 
    {
        int largest = i; 
        int l = 2 * i + 1;                   //Left child
        int r = 2 * i + 2;                   //Right child
 
        if (l < n && arr[l] > arr[largest])  //If left child is greater than parent then set largest is left child
            largest = l;
 
        if (r < n && arr[r] > arr[largest])  //If right child is greater than parent then set largest is right child
            largest = r;
 
        if (largest != i) {                  //After finding largest between left and right child swap largest with the parent node
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            heapify(arr, n, largest);
        }
    }
 
    static void printArray(int arr[])         //Function for printing the array
    {
        int n = arr.length;
 
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);           
		
		/*                                             if you want to give manual enteries the uncomment this
		System.out.print("Enter no of elements: ");    
		int n = sc.nextInt();                          
    		int[] arr = new int[n];
		System.out.print("Enter the elements: ");
		for(int i =0;i<n;i++)
		{
			int temp = sc.nextInt();                     
			arr[i] = temp;
		}
 		*/
		int n = args.length;
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = Integer.parseInt(args[i]);
		}
        HeapSort ob = new HeapSort();              
        ob.sort(arr);                              
 
        System.out.println("Sorted array is");
        printArray(arr);                          
    }
}
