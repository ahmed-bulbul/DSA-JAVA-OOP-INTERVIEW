package books.advantageOflambda;


import java.util.Comparator;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person();
        person.personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
