package unittest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class MyTest {

    @Test
    public void dummyTest() {
        // This is a dummy test that always passes
        assertEquals(String.valueOf(1), 1, 1);
        String[] arr1 = {"a", "b", "c", "d"};
        String[] arr2 = {"a", "b", "e", "f"};
        //startTest("HashMap", () -> intersectHashMap(arr1, arr2));
        startTest("HashSet", () -> intersectHashSet(arr1, arr2));
        startTest("Foreach", () -> intersectForeach(arr1, arr2));
        startTest("Stream ", () -> intersectStream(arr1, arr2));
    }

    public static void startTest(String name, Runnable test){
        long start = System.nanoTime();
        test.run();
        long end = System.nanoTime();
        System.out.println(name + ": " + (end - start) / 1000000.  + " ms");
    }

    public static String[] intersectHashSet(String[] arr1, String[] arr2){
        HashSet<String> set = new HashSet<>(Arrays.asList(arr1));
        set.retainAll(Arrays.asList(arr2));
        return set.toArray(new String[0]);
    }

    public static String[] intersectStream(String[] arr1, String[] arr2){
        return Arrays.stream(arr1)
                .distinct()
                .filter(x -> Arrays.asList(arr2).contains(x))
                .toArray(String[]::new);
    }

    public static String[] intersectForeach(String[] arr1, String[] arr2){
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++){
            for(int r = 0; r < arr2.length; r++){
                if(arr1[i].equals(arr2[r]))
                    result.add(arr1[i]);
            }
        }
        return result.toArray(new String[0]);
    }

}
