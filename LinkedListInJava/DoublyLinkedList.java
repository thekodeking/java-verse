package LinkedListInJava;

import javax.swing.text.StyledEditorKit;

class DNode{
    public int value;
    public DNode next;
    public DNode prev;
}

class DoublyLList{
    DNode head;
    DNode tail;
    int size;

    public DNode createDLL(int nodeValue){
        DNode newNode = new DNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
    public void insertingDLL(int nodeValue, int location){
        DNode newNode = new DNode();
        newNode.value = nodeValue;
        if (head == null){
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = null;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            DNode tempNode = head;
            int index = 0;
            while (index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }
    public void traverseDLL(){
        if (head!=null){
            DNode node = head;
            for (int i=0;i<size;i++){
                System.out.print(node.value);
                if (i!=size-1)
                    System.out.print(" -> ");
                node = node.next;
            }
            System.out.println();
            return;
        }
        System.out.println("DLL doesn't exists !");
    }
    public void reverseTraverseDLL(){
        if (head!=null){
            DNode node = tail;
            for (int i=0;i<size;i++){
                System.out.print(node.value);
                if (i!=size-1)
                    System.out.print(" <- ");
                node = node.prev;
            }
            System.out.println();
            return;
        }
        System.out.println("DLL doesn't exists !");
    }
    public Boolean searchNode(int nodeValue){
        if (head != null){
            DNode node = head;
            for (int i=0;i<size;i++){
                if (node.value == nodeValue){
                    System.out.println("Node found at index : "+i);
                    return true;
                }
                node = node.next;
            }
        }
        System.out.println("Node doesn't found!");
        return false;
    }
    public void deleteNode(int location){
        if (head == null){
            System.out.println("DLL doesn't exist to delete any node!");
            return;
        } else if (location == 0) {
            if (size == 1){
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        } else if (location >= size) {
            if (size == 1){
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        } else {
            DNode tempNode = head;
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
    public void deleteDLL() {
        DNode tempNode = head;
        for (int i=0;i<size;i++){
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("DLL deleted successfully!");
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLList dll = new DoublyLList();
        dll.createDLL(5);
//        System.out.println(dll.head.value);
        dll.insertingDLL(2,0);
        dll.insertingDLL(1,1);
        dll.insertingDLL(4,6);
        dll.traverseDLL();
//        dll.reverseTraverseDLL();
//        dll.searchNode(1);
//        dll.deleteNode(2);
        dll.deleteDLL();
        dll.traverseDLL();

    }
}
