package interview.agoda;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 123;

        int temp = number;

        int rev = 0;

        while (temp >0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        System.out.println(rev);
    }

}
