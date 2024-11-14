package dsa.lcd.stack;

public class Stack {

    int size;
    int[] arr;
    int top;

    public Stack(int size){
        this.arr = new int[size];
        this.top = -1;
        this.size = size;

    }

    public void push(int data){
        if(top >=size-1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = data;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }




}
