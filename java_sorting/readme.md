# HeapSort
 
### Heap sort algorithm
 
Heap sort is a comparison-based sorting technique based on Binary Heap data structure.
It is similar to the selection sort where we first find the minimum element and place the minimum element at the beginning.
Repeat the same process for the remaining elements.

Heap sort uses only one main functionality and it is called **heapify**.

A **max-heap** is a complete binary tree in which the value in each internal node is greater than or equal to the values in the children of that node.
 
In heapify the binary tree is converted to max heap so that we can remove the top element(largest number) and then again heapify it to get the largest element on top
and repeat the process again and again until there is no element left in the tree.

EX: arr = {5,4,3,2,1}

Add the top element to the end of the tree index in the array and do not consider for building tree anymore.
Ex:
       If the tree size is 5 then add the element to the fifth posistion of the array and reduce tree size to 4 and construct max heap.
Repeat the same process again and again until there is no elements left.

#### initial tree:
 
 ```
                1
             /     \
           2        4
         /   \    
       5       3 
 ```
 
 #### max heap (Iteration - 1):
 ```
                5
             /     \
           4        3
         /   \    
       2       1 
```
**Remove 5 from the tree and build max heap again**

#### max heap (Iteartion -2):
```
                4
             /     \
           3        2
         /      
       1       
```
**Remove 4 from the tree and build max heap again**

#### max heap (Iteraion - 3):
```
                3
             /     \
           2        1
```
**Remove 3 from the tree and build max heap again**

#### max heap(Iteration - 4):
```
                2
             /     
           1       
```

**Remove 2 from the tree and build max heap again**
**After removing 1 we do not have any more lements left so we have completed sorting the whole array**

The final arr will be {1 , 2 , 3 , 4 , 5 }
