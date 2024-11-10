package dsa.lcd.linkedlist.doubly;

public class DoublyLinkedList {

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    //add the data to front (head)
    public void addFront(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // add data to the end (rear)
    public void addEnd(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = tail = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    //delete front
    public void deleteFront(){
        if(head == null){
            System.out.println("List is empty !!");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
        }else{
            head=head.next;
            head.prev=null;

        }
    }

    //delete end
    public void deleteEnd(){
        if(tail ==null){
            System.out.println("List is empty!!!");
            return;
        }
        if(tail.prev==null){
            head=tail=null;
        }else{
            tail = tail.prev;
            tail.next=null;
        }
    }

    //display backward
    public void displayBackward(){
        Node current = tail;
        while (current!=null){
            System.out.println(current.data +"\t");
            current = current.prev;
        }
        System.out.println();
    }

    //display forward
    public void displayForward(){
        Node current = head;
        while (current!=null){
            System.out.println(current.data +"\t");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFront(1);
        doublyLinkedList.addFront(2);
        doublyLinkedList.addFront(3);
        doublyLinkedList.addFront(4);

        doublyLinkedList.displayForward();
        doublyLinkedList.displayBackward();

        doublyLinkedList.deleteFront();

        doublyLinkedList.displayForward();
    }




}
