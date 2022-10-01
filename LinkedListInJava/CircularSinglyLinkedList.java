package LinkedListInJava;

class CNode {
   public int value;
   public CNode next;
}

class CircularLinkedList{
    public CNode head = null;
    public CNode tail = null;
    public int size;

    public CNode createCSLL(int nodeValue){
        CNode node = new CNode();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInCSLL(int nodeValue, int location){
        CNode newNode = new CNode();
        newNode.value = nodeValue;
        if (head == null){
            createCSLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        } else if (location >= size) {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            CNode tempNode = head;
            int index = 0;
            while (index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
        size++;
    }

    public void traverseCSLL(){
        if (head != null){
            CNode node = head;
            for (int i=0;i<size;i++){
                System.out.print(node.value);
                if(i!=size - 1)
                    System.out.print(" -> ");
                node = node.next;
            }
            System.out.println();
        }
        else {
            System.out.println("Linked List doest exist !");
        }
    }

    public Boolean searchNode(int nodeValue){
        if (head != null){
            CNode tempNode = head;
            for (int i=0;i<size;i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node found at index : " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found! ");
        return false;
    }
    
    public void deleteNode(int location){
        if (head == null) {
            System.out.println("Linked list doesn't  exist ");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size==0){
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            CNode tempNode = head;
            int index = 0;
            while (index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
            if (tempNode == head){
                head.next = null;
                head = tail = null;
            }
        } else {
            CNode tempNode = head;
            int index = 0;
            while (index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            tempNode.next = tempNode.next.next;
        }
    }

    public void deleteCSLL(){
        if (head == null)
            System.out.println("Linked List doesn't exist!");

        head = null;
        tail.next = null;
        tail = null;
        System.out.println("CSLL deleted Successfully !");
    }
}

public class CircularSinglyLinkedList {
    public static void main(String[] args) {
        CircularLinkedList csll = new CircularLinkedList();
        csll.createCSLL(5);
        csll.insertInCSLL(4,0);
        csll.insertInCSLL(3,1);
//        System.out.println(csll.head.value);
        csll.traverseCSLL();
//        csll.searchNode(6);
//        csll.deleteNode(7);
//        csll.traverseCSLL();
        csll.deleteCSLL();
        csll.traverseCSLL();
    }
}
