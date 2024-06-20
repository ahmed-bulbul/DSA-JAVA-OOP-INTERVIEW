package dsa.linkedlist;

public class SinglyLinkedList {

    public static void main(String[] args) {

        Node head;

        Node n1 = new Node(18);
        Node n2 = new Node(10);
        Node n3 = new Node(16);


        head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;

        while (head !=null){
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println("null");


    }


}
