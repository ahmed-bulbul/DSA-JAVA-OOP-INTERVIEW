package books.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class PersonProcessor {
    public static void forEach(List<Person> persons, Consumer<Person> func){
        for(Person person : persons){
            func.accept(person);
        }
    }

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Jahanara Imam",65,"jahanara@imam.com"),
                new Person("Zahir Raihan",36,"jahir@gmail.com"));
        forEach(persons, Person::sendEmail);

        Function<String,Person> func1 = name->new Person(name);
        BiFunction<String,Integer,Person> func2 = (name,age)->new Person(name,age);

        //same as
        Function<String,Person> func3 = Person::new;
        BiFunction<String,Integer,Person> func4 = Person::new;
        Person p = func4.apply("bulbul",10);
        System.out.println(p);
    }
}
