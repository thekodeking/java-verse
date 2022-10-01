package Queue;

class Node {
    public int value;
    public LinkedListInJava.Node next;
}

class LinkedList {
    public LinkedListInJava.Node head;
    public LinkedListInJava.Node tail;
    public int size;

    public LinkedListInJava.Node createSinglyLinkedList(int nodeValue) {
        LinkedListInJava.Node node = new LinkedListInJava.Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        LinkedListInJava.Node node = new LinkedListInJava.Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            LinkedListInJava.Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            LinkedListInJava.Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traverseLinkedList(){
        if(head == null)
            System.out.println("SLL does not exist!");
        else{
            LinkedListInJava.Node tempNode = head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if (i != size-1)
                    System.out.print(" -> ");
                tempNode = tempNode.next;
            }
            System.out.println();
        }
    }

    public boolean searchNode(int nodeValue){
        if(head != null){
            LinkedListInJava.Node tempNode = head;
            for (int i=0;i<size;i++){
                if( tempNode.value  == nodeValue){
                    System.out.println("Node is present at "+i+"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node is not present in SLL");
        return false;
    }

    public void deletionOfNode(int location){
        if (head == null){
            System.out.println("SLL is empty!");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0)
                tail = null;
        } else if (location >= size) {
            LinkedListInJava.Node tempNode = head;
            for (int i=0;i<size-1;i++){
                tempNode = tempNode.next;
            }
            if (tempNode == head){
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            LinkedListInJava.Node tempNode = head;
            for (int i=0; i < location-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteSLL(){
        head = tail = null;
        System.out.println("SLL deleted successfully!");
    }
}

class QueueLL{
    LinkedList list;

    QueueLL(){
        list = new LinkedList();
        System.out.println("Queue successfully created! ");
    }
    boolean isEmpty(){
        if (list.head == null)
            return true;
        else
            return false;
    }
    void enQueue(int value){
        list.insertInLinkedList(value,list.size);
        System.out.println(value+" is inserted in queue successfully! ");
    }
    int deQueue(){
        int result = -1;
        if (isEmpty()){
            System.out.println("Queue is empty ! (dequeue) ");
        } else {
            result = list.head.value;
            list.deletionOfNode(0);
        }
        return result;
    }
    int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty ! (peek)");
            return -1;
        } else {
            return list.head.value;
        }
    }
    void delete(){
        list.head = null;
        list.tail = null;
        System.out.println("Queue is deleted Successfully");
    }
}
public class QueueLinkedList {
    public static void main(String[] args) {
        QueueLL qll = new QueueLL();
        qll.enQueue(5);
        qll.enQueue(3);
        qll.enQueue(2);
//        System.out.println(qll.isEmpty());
        System.out.println(qll.deQueue());
        System.out.println(qll.peek());
        qll.delete();
    }
}
