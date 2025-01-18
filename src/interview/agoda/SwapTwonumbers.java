package interview.agoda;

public class SwapTwonumbers {

    public static void main(String[] args) {
        int a = 10, b=20;
        a = a+b; // a = 30
        b = a-b; // b = 10
        a= a-b;  // a = 20

        System.out.println("a ="+a + " b = "+b);
    }
}
