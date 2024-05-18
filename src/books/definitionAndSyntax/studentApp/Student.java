package books.definitionAndSyntax.studentApp;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public Student() {

    }

    enum Gender{
        MALE,FEMALE
    }
    private String name;
    private int age;
    private Gender gender;

    public Student(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Student setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, Gender.FEMALE));
        students.add(new Student("Bob", 22, Gender.MALE));
        students.add(new Student("Charlie", 60, Gender.MALE));
        students.add(new Student("Diana", 23, Gender.FEMALE));
        students.add(new Student("Eve", 28, Gender.FEMALE));
        students.add(new Student("Frank", 24, Gender.MALE));
        students.add(new Student("Grace", 30, Gender.FEMALE));
        students.add(new Student("Hank", 20, Gender.MALE));
        students.add(new Student("Ivy", 21, Gender.FEMALE));
        students.add(new Student("Jack", 60, Gender.MALE));
        return students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
