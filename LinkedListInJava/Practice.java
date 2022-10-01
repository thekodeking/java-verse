package LinkedListInJava;

class Pnode{
    public int value;
    public Pnode next;
    public Pnode prev;
}

class PLinkedList{
    public Pnode head;
    public Pnode tail;
    public int size;

    public void createLL(int nodeValue){
        Pnode newNode = new Pnode();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail= newNode;
        size = 1;
    }
    public void insertLL(int nodeValue){
        if (head == null){
            createLL(nodeValue);
            return;
        }
        Pnode node = new Pnode();
        node.value = nodeValue;
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }
    public void traverseLL(){
        if (head != null){
            Pnode tempNode = head;
            for (int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if (i != size-1)
                    System.out.print(" -> ");
                tempNode = tempNode.next;
            }
            System.out.println();
        }
        else
            System.out.println("NO linked list found to traverse! ");
    }
}

public class Practice {
    public static void main(String[] args) {
        PLinkedList ll = new PLinkedList();
        ll.createLL(2);
        ll.insertLL(5);
        ll.insertLL(2);
        ll.insertLL(8);
//        ll.traverseLL();
        Questions q = new Questions();
//        q.removeDuplicates(ll);
//        Pnode n = q.nthElement(ll,2);
//        System.out.println(n.value);
//        q.partition(ll,5);
//        ll.traverseLL();

        /*
        //for question 4
        PLinkedList llA = new PLinkedList();
        llA.insertLL(7);
        llA.insertLL(1);
        llA.insertLL(6);
        PLinkedList llB = new PLinkedList();
        llB.insertLL(5);
        llB.insertLL(9);
        llB.insertLL(2);
        PLinkedList resultSum = q.sumLists(llA,llB);
        resultSum.traverseLL();
        */

        //for question 5
        PLinkedList llA = new PLinkedList();
        llA.insertLL(3);
        llA.insertLL(1);
        llA.insertLL(5);
        llA.insertLL(9);
        PLinkedList llB = new PLinkedList();
        llB.insertLL(2);
        llB.insertLL(4);
        llB.insertLL(6);
        q.addSameNode(llA,llB,7);
        q.addSameNode(llA,llB,2);
        q.addSameNode(llA,llB,1);

//        llA.traverseLL();
//        llB.traverseLL();
        Pnode inter = q.findIntersection(llA,llB);
        System.out.println(inter.value);

    }
}
