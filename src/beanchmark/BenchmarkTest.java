package beanchmark;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class BenchmarkTest {

    public static class StringInput {

        private String[] letters = { "q", "a", "z", "w", "s", "x", "e", "d", "c", "r", "f", "v", "t", "g", "b",
                "y", "h", "n", "u", "j", "m", "i", "k", "o", "l", "p" };

        public String s = "";

        public List<String> list;

        int next;

        // Simulates the setup method in JMH for normal Java class
        public void setUp(int next) {
            this.next = next;
            list = ThreadLocalRandom.current()
                    .ints(next, 0, letters.length)
                    .mapToObj(x -> letters[x])
                    .collect(Collectors.toList());
        }

        // Simulates the teardown method in JMH for normal Java class
        public void tearDown() {
            s = null;
            list = null;
        }
    }

    public static List<String> testCollection(StringInput si) {
        // Sorting the list using Collections.sort()
        Collections.sort(si.list, Comparator.naturalOrder());
        return si.list;
    }

    public static List<String> testStream(StringInput si) {
        // Sorting the list using streams
        return si.list.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Example run with different sizes of data
        int[] sizes = { 1000, 10000, 100000 };

        for (int size : sizes) {
            StringInput si = new StringInput();
            si.setUp(size);

            // Run collection sorting
            long startTime = System.nanoTime();
            List<String> sortedCollection = testCollection(si);
            long duration = System.nanoTime() - startTime;
            System.out.println("Collection sort time for size " + size + ": " + duration + " nanoseconds");

            // Reset and run stream sorting
            si.setUp(size);
            startTime = System.nanoTime();
            List<String> sortedStream = testStream(si);
            duration = System.nanoTime() - startTime;
            System.out.println("Stream sort time for size " + size + ": " + duration + " nanoseconds");

            si.tearDown();
        }
    }
}
