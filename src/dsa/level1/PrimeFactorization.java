package dsa.level1;

public class PrimeFactorization {

    public static void main(String[] args) {
        int number = 1440;
        for(int div = 2;div<number;div++){
            while(number % div ==0){
                System.out.println("number "+number);
                number = number/div;
                System.out.println(div);
            }
        }

        if(number !=1){
            System.out.println(number);
        }
    }
}
