package dsa.lcd.linkedlist;

public class Main {
    public static void main(String[] args) {

//        Node head = new Node(1);
//        System.out.println(head.data);
//        System.out.println(head.next);
//
//        Node node2 = new Node(667);
//        head.next = node2;
//        node2.next = null;
//
//        System.out.println(node2.data);
//        System.out.println(node2.next);
//        System.out.println(head.next.data);


        Node node1 = new Node(12);
        Node node2 = node1;

        System.out.println(node1.data);
        System.out.println(node2.data);

        node2.data = 55;

        System.out.println(node1.data);
        System.out.println(node2.data);

    }
}
