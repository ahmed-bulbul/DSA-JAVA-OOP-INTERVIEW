package dsa.lcd.queue;

public class DeQueueMain {

    public static void main(String[] args) {
        DeQueue deQueue = new DeQueue(5);
        deQueue.insertRear(10);
        deQueue.insertRear(20);
        deQueue.insertFront(30);
        deQueue.display();

        deQueue.deleteFront();
        deQueue.display();
        deQueue.insertFront(40);
        deQueue.display();
    }
}
