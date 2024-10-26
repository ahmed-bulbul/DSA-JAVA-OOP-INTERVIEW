package dsa.stack;
public class QueueT {
    int arr[];
    int size;
    int front;
    int rear;

    // Constructor
    public QueueT(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = 0;   // Tracks the index for removing elements
        this.rear = -1;   // Tracks the index for adding elements
    }

    // Method to add an element to the queue
    public void push(int data) {
        if (isFull()) throw new ArrayIndexOutOfBoundsException("Queue is full");
        arr[++rear] = data;
    }

    // Method to remove and return an element from the queue
    public int pop() {
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException("Queue is empty");
        return arr[front++];
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Main method for testing
    public static void main(String[] args) {
        QueueT q = new QueueT(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);

        // Popping all elements until the queue is empty
        while (!q.isEmpty()) {
            System.out.println(q.pop());
        }
    }
}
