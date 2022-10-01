package Queue;
class Queue {
    int[] arr;
    int topOfQueue,beginningOfQueue;

    Queue(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Queue is Successfully created with size : "+size);
    }
    boolean isFull(){
        if (topOfQueue == arr.length-1)
            return true;
        else
            return false;
    }
    boolean isEmpty(){
        if ( (beginningOfQueue == -1) ||  (beginningOfQueue == arr.length) )
            return true;
        else
            return false;
    }
    void enQueue(int value){
        if (isFull()){
            System.out.println("Queue is full, Can't insert value "+ value);
            return;
        } else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println(value+ " is successfully inserted in Queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println(value+ " is successfully inserted in Queue");
        }
    }
    int deQueue(){
        if (isEmpty()){
            System.out.println("Queue is empty, Can't delete! ");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue>topOfQueue)
                beginningOfQueue = topOfQueue = -1;
            return result;
        }
    }
    int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty (peek)");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }
    void deleteQueue(){
        arr = null;
        System.out.println("Queue is deleted Successfully! ");
    }

}

public class QueueArray {
    public static void main(String[] args) {
        Queue q = new Queue(3);
//        System.out.println(q.isEmpty());
//        System.out.println(q.isFull());
        q.enQueue(1);
        q.enQueue(3);
        q.enQueue(5);
        q.enQueue(7);
        System.out.println(q.deQueue());
        System.out.println(q.peek());
        q.deleteQueue();
    }
}
