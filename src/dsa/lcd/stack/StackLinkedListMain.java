package dsa.lcd.stack;

public class StackLinkedListMain {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.display();
        System.out.println("----");
        System.out.println("POP"+stack.pop());
        System.out.println("Peek "+stack.peek());
    }
}
