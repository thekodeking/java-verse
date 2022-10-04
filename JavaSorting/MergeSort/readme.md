# MergeSort
 
## Merge sort algorithm
 
The Merge Sort algorithm is a sorting algorithm that is based on the Divide and Conquer paradigm. In this algorithm, the array is initially divided into two equal halves and then they are combined in a sorted manner.

Heap sort uses two functions called **sort** and **merge**.

## Merge Sort Working Process:

Think of it as a recursive algorithm continuously splits the array in half until it cannot be further divided. This means that if the array becomes empty or has only one element left, the dividing will stop, i.e. it is the base case to stop the recursion. If the array has multiple elements, split the array into halves and recursively invoke the merge sort on each of the halves. Finally, when both halves are sorted, the merge operation is applied. Merge operation is the process of taking two smaller sorted arrays and combining them to eventually make a larger one.

## Illustration:
To know the functioning of merge sort,
lets consider an array arr[] = {38, 27, 43, 3, 9, 82, 10}
 
- At first, check if the left index of array is less than the right index, if yes then calculate its mid point

<p align="center" width="100%">
    <img src="https://media.geeksforgeeks.org/wp-content/uploads/20220525094221/Artboard71-300x150.jpg" alt="drawing"/>
</p>

- Now, as we already know that merge sort first divides the whole array iteratively into equal halves, unless the atomic values are achieved. 
- Here, we see that an array of 7 items is divided into two arrays of size 4 and 3 respectively.

<p align="center" width="100%">
    <img src="https://media.geeksforgeeks.org/wp-content/uploads/20220525094248/Artboard711-300x150.jpg" alt="drawing"/>
</p>

- Now, again find that is left index is less than the right index for both arrays, if found yes, then again calculate mid points for both the arrays.

 <p align="center" width="100%">
    <img src="https://media.geeksforgeeks.org/wp-content/uploads/20220525094314/Artboard721-300x150.jpg" alt="drawing"/>
</p>

- Now, further divide these two arrays into further halves, until the atomic units of the array is reached and further division is not possible.

 <p align="center" width="100%">
    <img src="https://media.geeksforgeeks.org/wp-content/uploads/20220525094341/Artboard731-300x150.jpg" alt="drawing"/>
</p>

- After dividing the array into smallest units, start merging the elements again based on comparison of size of elements
Firstly, compare the element for each list and then combine them into another list in a sorted manner.

<p align="center" width="100%">
    <img src="https://media.geeksforgeeks.org/wp-content/uploads/20220525094403/Artboard741-300x150.jpg" alt="drawing"/>
</p>

- After the final merging, the list looks like this:

<p align="center" width="100%">
    <img src="https://media.geeksforgeeks.org/wp-content/uploads/20220525094459/Artboard751-300x150.jpg" alt="drawing"/>
</p>

-----

The following diagram shows the complete merge sort process for an example array {38, 27, 43, 3, 9, 82, 10}. 

If we take a closer look at the diagram, we can see that the array is recursively divided into two halves till the size becomes 1. Once the size becomes 1, the merge processes come into action and start merging arrays back till the complete array is merged.

<p align="center" width="100%">
    <img src="https://media.geeksforgeeks.org/wp-content/uploads/20220722205737/MergeSortTutorial.png" alt="drawing"/>
</p>