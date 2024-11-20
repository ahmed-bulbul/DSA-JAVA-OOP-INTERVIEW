package dsa.lcd.stack;

public class StackLinkedList {
    private Node top;
    public StackLinkedList() {
        this.top = null;
    }


    //is empty
    public boolean isEmpty(){
        if (this.top ==null){
            System.out.println("Stack is empty");
            return true;
        }else{
            return false;
        }
    }

    //push
    public void push(int data){
        Node node = new Node(data);
        if (top != null) {
            node.next = top;
        }
        top = node;
    }

    //pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Empty!!");
            return -1;
        }else{
            int value = top.data;
            top = top.next;
            return value;
        }
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Empty!!");
            return -1;
        }else{
            return top.data;
        }
    }

    //display
    public void display(){
        if(isEmpty()){
            System.out.println("Empty!!");
            return;
        }else{
            Node temp = top;
            while (temp !=null){
                System.out.println(temp.data +"\t");
                temp = temp.next;
            }
            System.out.println();
        }
    }

}
