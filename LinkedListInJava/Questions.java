package LinkedListInJava;
import java.util.*;

public class Questions {

    //Question 1 : remove duplicates from an unsorted Linked List
    void removeDuplicates(PLinkedList ll){
        HashSet<Integer> hs = new HashSet<>();
        Pnode current = ll.head;
        Pnode prev = null;
        while (current != null){
            if (hs.contains(current.value)){
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(current.value);
                prev = current;
            }
            current = current.next;
        }
    }

    //Question 2: algorithm  to find nth to last element of singly linked list
    Pnode nthElement(PLinkedList ll, int location){
        Pnode node1 = ll.head;
        Pnode node2 = ll.head;
        int index = 0;
        while (index < location){
            if (node1 == null) return null;
            node1 = node1.next;
            index++;
        }
        while (node1 != null){
            node1 = node1.next;
            node2 = node2.next;
        }
        return node2;
    }

    //Question 3: Write code to partition a linked list around a value of x, such that all nodes less than x
    //come before all nodes greater than or equal to x
    PLinkedList partition(PLinkedList ll, int x){
        Pnode currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null){
            Pnode tempNode = currentNode.next;
            if (currentNode.value < x){
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = tempNode;
        }
        ll.tail.next = null;
        return ll;
    }

    /*
    Question 4: You have two numbers represented by a linked list, where each node contains a single digit.
    The digits are stored in reverse order, such that 1's digit is at the head of the list. Write a function
    that adds the two numbers and returns the sum as a linked list.

     list1 = 7->1->6  ---> 617 ___addition___  912 -> sumList = 2->1->9
     list2 = 5->9->2  ---> 295
     */
    PLinkedList sumLists(PLinkedList llA, PLinkedList llB){
        Pnode node1 = llA.head;
        Pnode node2 = llB.head;
        int carry = 0;
        PLinkedList resultLL = new PLinkedList();
        while (node1!=null || node2!=null){
            int result = carry;
            if (node1 != null){
                result += node1.value;
                node1 = node1.next;
            }
            if (node2 != null){
                result += node2.value;
                node2 = node2.next;
            }
            resultLL.insertLL(result%10);
            carry = result / 10;
        }
        return resultLL;
    }

    /*
    Question 5: given two(singly) linked lists, determine if the two list intersect, Return the intersecting
    node. Note that the intersection is defined based on reference, not value. That is, if the kth node of the first
    linked list is the exact same node (by reference) as the jth node of the second linked list, they are intersecting.
     */

    //get Kth node
    Pnode getKthNode(Pnode head, int k){
        Pnode current = head;
        while (k>0 && current!=null){
            current = current.next;
            k--;
        }
        return current;
    }

    //intersection method
    Pnode findIntersection(PLinkedList list1, PLinkedList list2){
        if (list1.head == null || list2.head==null) return null;
        if (list1.tail != list2.tail) return null;

        Pnode longer = new Pnode();
        Pnode shorter = new Pnode();
        if (list1.size > list2.size){
            longer = list1.head;
            shorter = list2.head;;
        } else {
            longer = list2.head;
            shorter = list1.head;
        }
        longer = getKthNode(longer, Math.abs(list1.size- list2.size));
        while (shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }

    //insert same node
    void addSameNode(PLinkedList llA, PLinkedList llB, int nodeValue){
        Pnode newNode = new Pnode();
        newNode.value = nodeValue;
        newNode.next = null;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
//        llA.insertLL(nodeValue);
//        llB.insertLL(nodeValue);
    }
}
