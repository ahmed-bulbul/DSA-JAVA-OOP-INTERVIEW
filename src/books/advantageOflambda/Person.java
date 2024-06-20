package books.advantageOflambda;

import java.util.List;

public class Person {

    private String name;
    private int age;

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

    public List<Person> personList = List.of(
        new Person().setName("John").setAge(20),
        new Person().setName("Doe").setAge(30),
        new Person().setName("Jane").setAge(25)
    );
}
