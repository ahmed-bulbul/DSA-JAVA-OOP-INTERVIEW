package books.definitionAndSyntax;

import javax.swing.filechooser.FileFilter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class AdderImpl implements Adder{
    @Override
    public int add(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Adder adder = new AdderImpl();
        Adder adder1 = new Adder() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        Adder adder2 = (int a,int b)-> a+b;

        System.out.println(adder.add(10,10));

        Comparator<String> comparator;
        comparator = (String s1, String s2)->s1.compareToIgnoreCase(s2);
        System.out.println("compare: "+comparator.compare("hello","hello"));

        ArrayList<String> list = new ArrayList<>();
        list.sort((String s1,String s2)-> s1.compareToIgnoreCase(s2));

        Runnable runnable = () -> System.out.println("hello world!!");
        Callable<Runnable> callable = () -> runnable;

        //Callable<Integer> c2 = flag ? (()-> 102) : (()->100);

        //Object o = ()-> "hi";
        Object s = (Supplier) ()-> "hi";
    }
}
