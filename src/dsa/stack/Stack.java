package dsa.stack;
// Stack implementation in Java

class Stack {

    int arr[];
    int top;
    int size;

    public Stack(int size){
        this.arr = new int[size];
        this.size = size;
        this.top = -1;
    }

    public void push(int data){
        if(isFull()) throw new ArrayIndexOutOfBoundsException("Array is full");
        arr[++top] = data;
    }

    public int pop(){
        return arr[top--];
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int search(int data) {
        for (int i = 0; i <= top; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public void display(){
        for (int i=0;i<=top;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }



}