package dsa.lcd.queue;

public class Main {

    public static void main(String[] args) {
        SimpleQueue simpleQueue = new SimpleQueue(5);

        simpleQueue.enqueue(200);
        simpleQueue.enqueue(300);
        simpleQueue.enqueue(400);
        simpleQueue.enqueue(500);
        simpleQueue.enqueue(600);

        simpleQueue.display();

        simpleQueue.dequeue();

        simpleQueue.enqueue(700);


    }
}
