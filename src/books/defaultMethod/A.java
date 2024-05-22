package books.defaultMethod;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface A {

    default void hi(){
        System.out.println("Hi from A");
    }
}

interface B extends A{
    default void hi(){
        System.out.println("Hi from B");
    }
}

class C implements A,B{
//    public void hi(){
//        System.out.println("Hi from C");
//    }

    public static void main(String[] args) {
        C c = new C();
        c.hi();

        List<Integer> integerList = List.of(1,2,3);
        Set<Integer> integerSet = Set.of(1,2,3);
        Map<String,String> map = Map.of("a","b","c","d");
        System.out.println(integerList);
        System.out.println(integerSet);
        System.out.println(map);
    }
}
