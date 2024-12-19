package dsa.lcd.stack.practice;

import dsa.lcd.stack.Stack;

public class QueueUsingStack {

    //stack 1 is used for enqueue
    //stack 2 is used for dequeue
    Stack stack1;
    Stack stack2;
    int size;
    public QueueUsingStack(int size){
        this.size = size;
        stack1 = new Stack(size);
        stack2 = new Stack(size);
    }

    public void enqueue(int data){
        stack1.push(data);
    }

    public int dequeue(){

        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);


        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }


}
