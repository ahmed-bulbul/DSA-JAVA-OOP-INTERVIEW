package interview;

public class Response1 {
    public static int reverse(int number) {

        String numString = Integer.toString(number);

        String reversedString = new StringBuilder(numString).reverse().toString();

        int reversedNumber = Integer.parseInt(reversedString);

        return reversedNumber;
    }

    public static int getOpposite(int number) {
        // opposite number
        int opposite = 0;
        while (number != 0) {
            opposite = opposite * 10 + number % 10;
            number = number / 10;
        }
        return opposite;
    }


    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = getOpposite(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
