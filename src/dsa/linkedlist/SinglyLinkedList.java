package dsa.linkedlist;

public class SinglyLinkedList {

    Node head;

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertAtBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node forw = null;

        while (curr !=null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        head = prev;
    }

    public void display(){
        Node current = head;
        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(12);
        list.display();
        list.insertAtBegin(5);
        list.display();
        list.reverse();
        list.display();

    }


}
