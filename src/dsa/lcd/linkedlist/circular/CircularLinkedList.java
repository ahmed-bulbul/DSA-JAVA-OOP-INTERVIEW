package dsa.lcd.linkedlist.circular;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    //add front
    public void addFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;

            head.next = head;
            head.prev = head;

        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;

        }
    }

    //add data item to end
    public void addEnd(int data) {
        Node newNode = new Node(data);
        if(tail == null) {
            this.head = newNode;
            this.tail = newNode;
            head.next = head;
            head.prev = head;

        } else {

            newNode.prev = tail; 
            newNode.next = head;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;

        }
    }

}
