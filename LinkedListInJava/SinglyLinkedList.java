package LinkedListInJava;

class Node {
    public int value;
    public Node next;
}

class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
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
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traverseLinkedList(){
        if(head == null)
            System.out.println("SLL does not exist!");
        else{
            Node tempNode = head;
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
            Node tempNode = head;
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
            Node tempNode = head;
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
            Node tempNode = head;
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

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList sLL = new LinkedList();
        sLL.createSinglyLinkedList(10);
        sLL.insertInLinkedList(6,1);
        sLL.insertInLinkedList(7,5);
        sLL.insertInLinkedList(2,3);
        sLL.traverseLinkedList();
        sLL.searchNode(7);
        sLL.deletionOfNode(0);
        sLL.traverseLinkedList();
        sLL.deleteSLL();
        sLL.traverseLinkedList();

    }
}
