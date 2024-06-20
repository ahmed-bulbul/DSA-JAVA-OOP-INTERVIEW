package books.advantageOflambda;


import java.util.Comparator;
import java.util.List;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person();
        person.personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        List<Person> personList1 = getPersonList();
        personList1.forEach(person1->{
            if(person1.getAge()>18){
                System.out.println("yes.........");
            }
        });

        personList1.parallelStream().forEach(person1 -> {
            if(person1.getAge() > 18){
                System.out.println("Parallel Stream....");
            }
        });

    }

    public void sendEmailForVote(List<Person> personList){
        for(Person person : personList){
            if(person.getAge() >=18){
                sendEmail(person);
            }
        }
    }

    static List<Person> personList = List.of(new Person());
    public static List<Person> getPersonList() {
        return personList;
    }

    private void sendEmail(Person person) {
        System.out.println("Sending email to:"+person.getName());
    }
}
