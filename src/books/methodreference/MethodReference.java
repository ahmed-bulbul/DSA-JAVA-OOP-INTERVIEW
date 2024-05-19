package books.methodreference;

import books.definitionAndSyntax.studentApp.Student;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bulbul", "ahmed", "tamim");
      //  list.sort((a,b)->a.compareToIgnoreCase(b));
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);

        Function<Student,String> function = s->s.getName();


        Function<Student,String> function1 = Student::getName;

        Function<String,Integer> mapper = Integer::parseInt;
        System.out.println(mapper.apply("10"));

       // Function<String,Integer> mapper1= Integer::sum; // not ok
        BiFunction<Integer,Integer,Integer> sum = Integer::sum;

        //########### TRY ##################

        String val = "tree";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < val.length(); i++) {
            char c = val.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));


        System.out.println(entryList);

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : entryList){
            Character c = entry.getKey();
            int v = entry.getValue();

            for(int i=0;i<v;i++){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
