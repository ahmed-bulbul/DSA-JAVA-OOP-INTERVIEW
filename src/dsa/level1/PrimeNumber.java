package dsa.level1;

public class PrimeNumber {

    public static void main(String[] args) {
      //  sieveOfEratosthenes(10);
        System.out.println(totalPrime(20));

    }


    static int totalPrime(int n){
        int result = 0;
        for(int i=2;i<=n;i++){
            int count =0;
            for(int k = 2;k * k <=i;k++){
                if(i % k ==0){
                    count ++;
                    break;
                }
            }
            if(count == 0){
                System.out.print(i+", ");
                result++;
            }
        }
        System.out.println();

        return result;
    }



    static  void sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and
        // initialize all entries it as true. A value in
        // prime[i] will finally be false if i is Not a
        // prime, else true.
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == true) {
                // Update all multiples of p greater than or
                // equal to the square of it numbers which
                // are multiple of p and are less than p^2
                // are already been marked.
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }

}
