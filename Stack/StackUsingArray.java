package Stack;

class Stack{
    int[] arr;
    int topOfStack;

    Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack is created with size : "+size);
    }
    boolean isEmpty(){
        if (topOfStack == -1)
            return true;
        else
            return false;
    }
    boolean isFull(){
        if (topOfStack == arr.length-1){
//            System.out.println("Stack is full!");
            return true;
        } else
            return false;
    }
    void push(int value){
        if (isFull())
            System.out.println("Stack is Full, Can't insert");
        else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println(value+" is inserted successfully!");
        }
    }
    int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty, Can't pop");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }
    int peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }
    void deleteStack(){
        arr = null;
        System.out.println("Stack is delete successfully");
    }


}
public class StackUsingArray {
    public static void main(String[] args) {
        Stack s = new Stack(3);
//        System.out.println(s.isFull());
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.deleteStack();
    }
}
