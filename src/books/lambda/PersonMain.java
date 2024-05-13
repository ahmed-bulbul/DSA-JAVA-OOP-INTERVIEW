package books.lambda;

import java.util.Arrays;
import java.util.List;

public class PersonMain {

    public static void main(String[] args) {
        PersonService personService = new PersonService();
       List<Person> personList =  personService.loadPersons(10);
        List<Person> personOlderThan30 = personService.filter(personList,personService.fileAgeGraterThan30);
        System.out.println(personOlderThan30);
    }

}
