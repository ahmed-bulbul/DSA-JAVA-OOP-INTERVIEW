package dsa.lcd.queue;

public class CircularMain {

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(4);

        circularQueue.enqueue(5);
        circularQueue.enqueue(10);
        circularQueue.enqueue(12);
        circularQueue.enqueue(13);

        circularQueue.display();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.display();
        circularQueue.enqueue(40);




        System.out.println("Size is "+circularQueue.size());
        circularQueue.display();

    }
}
