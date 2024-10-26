package dsa.linkedlist;

public class SumArrayCorrect {
    public static int sum = 0;

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numThreads = 5;
        int chunkSize = arr.length / numThreads;

        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i + 1) * chunkSize;

            threads[i] = new Thread(() -> {
                for (int j = start; j < end; j++) {
                    sum += arr[j];
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        System.out.println("Sum: " + sum);
    }
}
