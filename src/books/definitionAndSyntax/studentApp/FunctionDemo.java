package books.definitionAndSyntax.studentApp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

    public static void main(String[] args) {
        Student student = new Student();
        List<Student> studentList = student.getStudents();

        Function<Student,String> nameFunc = (Student s )-> s.getName();
        Function<Student,String> ageFunc = (Student s)->String.valueOf(s.getAge());
        Function<Student,String> genderFunc = (Student s)->s.getGender().toString();

        StudentProcessor processor = new StudentProcessor();
        List<String> names = processor.process(studentList,nameFunc);
        List<String> ages = processor.process(studentList,ageFunc);
        List<String> genders = processor.process(studentList,genderFunc);
        System.out.println(names+" - "+ages);

        Predicate<Student> olderThan50 = (Student s)->s.getAge() > 50;
        Predicate<Student> femaleOnly = (Student s)->s.getGender().equals(Student.Gender.FEMALE);

        List<Student> studentsOlderThan50 = processor.filter(studentList,olderThan50);
        List<Student> femaleStudents = processor.filter(studentList,femaleOnly);
        System.out.println(studentsOlderThan50);
        System.out.println(femaleStudents);

        // passing as argument
        List<String> studentNames = processor.process(studentList,s->s.getName());

    }
}
