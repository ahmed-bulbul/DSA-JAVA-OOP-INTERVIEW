package dsa.lcd.stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(4);
        stack.display();
        System.out.println("Pop element "+stack.pop());
        stack.display();
        System.out.println("Peek element is "+stack.peek());
    }
}
