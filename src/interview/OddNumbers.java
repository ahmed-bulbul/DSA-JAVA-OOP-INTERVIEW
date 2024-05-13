package interview;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        List<Integer> oddNumbers = findOddNumbers(numbers);

        for (int num : oddNumbers) {
            System.out.println(num);
        }
    }

    public static List<Integer> findOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }

        return oddNumbers;
    }
}
