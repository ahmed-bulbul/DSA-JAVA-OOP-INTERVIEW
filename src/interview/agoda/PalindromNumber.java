package interview.agoda;

public class PalindromNumber {

    public static void main(String[] args) {
        int n = 121;

        int rev = 0;

        int temp = n;

        while (temp >0){
            int r = temp % 10;
            rev = rev * 10 + r;
            temp = temp /10;
        }

        if(rev == n) {
            System.out.println("Palindrom");
        }else{
            System.out.println("Not palindrom");
        }

    }
}
