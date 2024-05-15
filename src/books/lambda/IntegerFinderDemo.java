package books.lambda;

import java.util.Arrays;
import java.util.List;

public class IntegerFinderDemo {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,5,1,7,8,4,9);
        find(ints,8);
    }

    private static void find(List<Integer> ints, int num) {
        boolean found = false;

        for(Integer integer : ints){
            if(integer.equals(num)){
                found = true;
                break;
            }
        }

        if(found) System.out.println(num+" Found");
        else System.out.println(num+" not found");
    }
    private static void findInteger(List<Integer> integers, int num) {
        if(integers.contains(num)){
            System.out.println(num + " Found");
        }else{
            System.out.println(num + " not found");
        }
    }

}
