package books.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {

    enum Sex{
        MALE,FEMALE
    }
    private int age;
    private String name;
    private Sex sex;


    public Person(int age, String name, Sex sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Sex getSex() {
        return sex;
    }

    public Person setSex(Sex sex) {
        this.sex = sex;
        return this;
    }







    public static void main(String[] args) {

        Stream<Person> personStream = Stream.of(
                new Person(15,"Sayeem", Sex.MALE),
                new Person(12,"Tamanna",Sex.FEMALE),
                new Person(23,"Eram",Sex.MALE),
                new Person(20,"Rifat",Sex.MALE),
                new Person(8,"Saif",Sex.MALE),
                new Person(8,"Omio",Sex.FEMALE)
        );
//        Stream<Person> personOlderThan15 = personStream.filter(person -> person.getAge() > 15);
//
//        Stream<String> nameStream = personOlderThan15.map(person -> person.getName());
//
//        nameStream.forEach(name -> System.out.println(name));

        //same line
//        personStream.filter(person -> person.getAge() > 15)
//                .map(Person::getName)
//                .forEach(System.out::println);

//        personStream.filter(person -> person.isOlderThan15(person))
//                .map(Person::getName)
//                .forEach(System.out::println);

         List<Person> personList =  List.of(
                new Person(15,"Sayeem", Sex.MALE),
                new Person(12,"Tamanna",Sex.FEMALE),
                new Person(23,"Eram",Sex.MALE),
                new Person(20,"Rifat",Sex.MALE),
                new Person(8,"Saif",Sex.MALE),
                new Person(8,"Omio",Sex.FEMALE)
        );

//         personList.stream()
//                 .sorted((p1,p2) -> {
//                    if(p1.getAge() > p2.getAge()){
//                        return 1;
//                    }else if(p1.getAge() < p2.getAge()){
//                        return -1;
//                    }else{
//                        return p1.getName().compareTo(p2.getName());
//                    }
//                 }).forEach(person -> System.out.println(person.getAge() + " "+person.getName()));

//         personList.stream().sorted(Comparator.comparing(Person::getAge).reversed())
//                 .forEach(person -> System.out.println(person.getAge() + " "+ person.getName()));

//        Comparator<Person> compareByAgeThenName = Comparator.comparing(Person::getAge)
//                .thenComparing(Person::getName);
//
//        personList.stream().sorted(compareByAgeThenName).forEach(person -> System.out.println(person.getName()));

//        personList.stream()
//                .sorted(Comparator
//                        .nullsFirst(Comparator.comparing(Person::getAge))
//                        .thenComparing(Comparator
//                                .nullsLast(Comparator.comparing(Person::getName))))
//                .forEach(person -> System.out.println(person.getName()));

        //peek
        List<Person> people = personList.stream()
                .peek(person -> System.out.println("Before filter : "+person.getAge() + ": "))
                .filter(person -> person.getAge() > 10)
                .collect(Collectors.toList());

    }

    boolean isOlderThan15(Person person){
        return 15 < person.getAge();
    }
}
