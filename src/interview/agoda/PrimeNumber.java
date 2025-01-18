package interview.agoda;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        boolean isPrime = true;

        for(int i=2;i<n/2;i++){
            if(n % i ==0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println("Prime number");
        }else{
            System.out.println("Not prime");
        }
    }
}
