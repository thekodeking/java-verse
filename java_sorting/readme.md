<h1>HeapSort<h1>
 
<h3>Heap sort algorithm<h3>
 
      Heap sort is a comparison-based sorting technique based on Binary Heap data structure.
      It is similar to the selection sort where we first find the minimum element and place the minimum element at the beginning.
      Repeat the same process for the remaining elements.

Heap sort uses only one main functionality and it is called <b>heapify<b>.

A max-heap is a complete binary tree in which the value in each internal node is greater than or equal to the values in the children of that node.
 
In heapify the binary tree is converted to max heap so that we can remove the top element(largest number) and then again heapify it to get the largest element on top
and repeat the process again and again until there is no element left in the tree.

EX: arr = {5,4,3,2,1}
 
initial tree:
 
 ```
                1
             /     \
           2        4
         /   \    
       5       3 
 ```
