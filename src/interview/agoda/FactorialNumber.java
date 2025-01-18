package interview.agoda;

public class FactorialNumber {
    public static void main(String[] args) {
        int n = 5;
        int sum = 1;
        for(int i=n;i>=1;i--){
            sum = sum * i;
        }

        System.out.println(sum);
    }
}
