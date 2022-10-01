package LinkedListInJava;

class CDnode{
    public int value;
    public CDnode next;
    public CDnode prev;
}
class CircularDLL{
    public CDnode head;
    public CDnode tail;
    int size;

    CDnode createCDLL(int nodeValue){
        CDnode node = new CDnode();
        node.value = nodeValue;
        head = node;
        tail = node;
        node.next = node;
        node.prev = node;
        size = 1;
        return  head;
    }
    void insertNode(int nodeValue, int location){
        CDnode node = new CDnode();
        node.value = nodeValue;
        if (head == null){
            createCDLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;
        } else if (location >= size) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            tail = node;
        } else {
            CDnode tempNode = head;
            int index = 0;
            while (index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            node.prev = tempNode;
            node.next = tempNode.next;
            tempNode.next = node;
            tempNode.next.prev = node;
        }
        size++;
    }
    void traverseCDLL(){
        if (head != null){
            CDnode  tempNode = head;
            for (int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if (i != size-1)
                    System.out.print(" -> ");
                tempNode = tempNode.next;
            }
            System.out.println();
        } else
            System.out.println("CDLL doesn't exist to Traverse");
    }
    void reverseTraverseCDLL(){
        if (head != null){
            CDnode  tempNode = tail;
            for (int i=0;i<size;i++)  {
                System.out.print(tempNode.value);
                if (i != size-1)
                    System.out.print(" <- ");
                tempNode = tempNode.prev;
            }
            System.out.println();
        } else
            System.out.println("CDLL doesn't exist to Traverse");
    }
    Boolean searchNodeCDLL(int nodeValue){
        if (head != null){
            CDnode tempNode = head;
            for (int i=0; i<size; i++){
                if (tempNode.value == nodeValue){
                    System.out.println("Node found at index : "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node doesn't exist while searching");
        return false;
    }

    void deleteNode(int location){
        if (head == null){
            System.out.println("CDLL doesn't exist to delete Node ");
            return;
        } else if (location == 0) {
            if (size == 1){
                head.next = null;
                head.prev = null;
                head = tail = null;
                size--;
                return;
            }else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if (size == 1){
                head.next = null;
                head.prev = null;
                head = tail = null;
                size--;
                return;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        } else {
            CDnode tempNode = head;
            int index = 0;
            while (index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }
    void deleteCDLL(){
            CDnode  tempNode = head;
            for (int i=0;i<size;i++){
                tempNode.prev = null;
                tempNode = tempNode.next;
            }
            head = null;
            tail = null;
        System.out.println("CDLL has been deleted successfully!");
        }
}
public class CircularDoublyLinkedList {
    public static void main(String[] args) {
        CircularDLL cdll = new CircularDLL();
        cdll.createCDLL(5);
//        System.out.println(cdll.head.value);
//        System.out.println(cdll.head.next.value);
        cdll.insertNode(2,0);
        cdll.insertNode(3,2);
        cdll.insertNode(4,5);
        cdll.traverseCDLL();
//        cdll.reverseTraverseCDLL();
//        cdll.searchNodeCDLL(6);
//        cdll.deleteNode(1);
        cdll.deleteCDLL();
        cdll.traverseCDLL();
    }
}
