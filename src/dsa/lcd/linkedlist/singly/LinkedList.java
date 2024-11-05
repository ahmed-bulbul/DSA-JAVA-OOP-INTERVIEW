package dsa.lcd.linkedlist.singly;

public class LinkedList {

    Node head = null;

    public void insertAtBeginning(int item){
        Node newNode = new Node(item);

        if(head == null){
            head = newNode;
            return;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtEnd(int item){
        Node newNode = new Node(item);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next !=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtPosition(int item, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(item);

        if (position == 0) { // Insert at the beginning
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int index = 0;

        // Traverse to the position just before the desired position
        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }

        // If temp is null here, it means the position was out of bounds
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        // Insert the new node at the specified position
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printData(){
        Node temp = head;

        if(temp == null){
            System.out.println("LinkedList is empty!!");
            return;
        }

        while (temp != null){
            if(temp.next == null)
                System.out.println(temp.data);
            else
                System.out.print(temp.data + " ==> ");
            temp = temp.next;
        }
    }

    public void deleteFirst(){
        if(head ==null){
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteFromPosition(int position){
        if(head ==null){
            System.out.println("List is empty");
        }
        if(position == 0){
            head = head.next;
        }

        Node temp = head;
        for(int i=0;i<position -1 && temp !=null;i++){
            temp = temp.next;
        }

        if(temp == null || temp.next == null){
            System.out.println("Position is out of bound");
            return;
        }
        temp.next = temp.next.next;

    }

    public boolean searchData(int data){
        if(head == null){
            System.out.println("List is empty");
        }
        Node temp = head;
        while (temp !=null){
            if(temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
