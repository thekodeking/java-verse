package Queue;

class CQueue{
    int[] arr;
    int topOfCircularQueue, beginningOfCircularQueue, size;

    CQueue(int size){
        this.arr = new int[size];
        this.size = size;
        topOfCircularQueue = -1;
        beginningOfCircularQueue = -1;
        System.out.println("Circular Queue is created with size : "+size);
    }
    boolean isEmpty(){
        if (topOfCircularQueue == -1)
            return true;
        else
            return false;
    }
    boolean isFull(){
        if (topOfCircularQueue+1 == beginningOfCircularQueue)
            return true;
        else if (topOfCircularQueue+1==size && beginningOfCircularQueue==0)
            return true;
        else
            return false;
    }
    void enQueue(int value){
        if (isFull()){
            System.out.println("Circular Queue is full, Can't insert value "+value);
            return;
        } else if (isEmpty()) {
            beginningOfCircularQueue = 0;
            topOfCircularQueue++;
            arr[topOfCircularQueue] = value;
            System.out.println(value+" is inserted in Circular Queue Successfully!");
        } else {
            if (topOfCircularQueue+1 == size)
                topOfCircularQueue = 0;
            else
                topOfCircularQueue++;

            arr[topOfCircularQueue] = value;
            System.out.println(value+" is inserted in Circular Queue Successfully!");
        }
    }
    int deQueue(){
        if (isEmpty()){
            System.out.println("Circular Queue is empty, can't delete");
            return -1;
        } else {
            int result = arr[beginningOfCircularQueue];
            arr[beginningOfCircularQueue] = 0;
            if (beginningOfCircularQueue == topOfCircularQueue)
                beginningOfCircularQueue = topOfCircularQueue = -1;
            else if (beginningOfCircularQueue+1 == size)
                beginningOfCircularQueue = 0;
            else
                beginningOfCircularQueue++;
            return result;
        }
    }
    int peek(){
        if (isEmpty()){
            System.out.println("Circular queue is empty (peek) ");
            return -1;
        } else {
            return arr[beginningOfCircularQueue];
        }
    }
    void deleteQueue(){
        arr = null;
        System.out.println("Circular queue is deleted Successfully! ");
    }
}
public class CircularQueueArray {
    public static void main(String[] args) {
        CQueue cq = new CQueue(3);
//        System.out.println(cq.isEmpty());
//        System.out.println(cq.isFull());
        cq.enQueue(1);
        cq.enQueue(3);
        cq.enQueue(2);
        System.out.println(cq.deQueue());
        System.out.println(cq.peek());
        cq.deleteQueue();

    }
}
