package dsa.lcd.queue;

public class CircularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size; //actual element
    private int capacity; // total capacity of queue

    public CircularQueue(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        rear = -1;
        front = 0;
    }

    /**
     * Insertion operation  @Param data
     * */
    public void enqueue(int data){
        if(size == capacity){
            System.out.println("Queue is full");
            return;
        }

        rear = ( rear + 1 ) % capacity;
        queue[rear] = data;
        size++;
    }

    /**
     * delete from front
     * */
    public int dequeue(){
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        //actual delete
        int deletedItem = queue[front];
        front = ( front + 1 ) % capacity;
        size--;
        return deletedItem;
    }

    public int size(){
        return this.size;
    }

    public void display(){
        if(size == 0){
            System.out.println("Queue is empty");
            return;
        }

        for(int i=0;i<size;i++){
           int position = (front+i) % capacity;
           int data = queue[position];
           System.out.print(data +"\t");
        }
        System.out.println();
    }




}
