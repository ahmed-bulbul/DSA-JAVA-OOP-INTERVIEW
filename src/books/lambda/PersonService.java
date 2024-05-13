package books.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonService {


    List<Person> personList = loadPersons(20);
    List<Person> personOlderThan30 = filter(personList, new Filterable() {
        @Override
        public boolean apply(Person person) {
            return person.getAge() > 30;
        }
    });


    public List<Person> filter(List<Person> personList, Filterable filterable){
        List<Person> filteredPersonList = new ArrayList<>();

        for(Person person : personList){
            if(filterable.apply(person)){
                filteredPersonList.add(person);
            }
        }
        return filteredPersonList;
    }

    public List<Person> loadPersons(int count) {
        List<Person> persons = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            String name = generateRandomName();
            int age = random.nextInt(100); // Random age between 0 and 99
            String address = generateRandomAddress();
            persons.add(new Person(name, age, address));
        }

        return persons;
    }

    public String generateRandomName() {
        String[] names = {"John", "Jane", "Michael", "Emily", "David", "Sarah", "Christopher", "Jessica", "Matthew", "Amanda"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public String generateRandomAddress() {
        String[] streets = {"Main Street", "Maple Avenue", "Elm Street", "Oak Drive", "Cedar Lane", "Pine Street", "First Street", "Second Avenue"};
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego"};
        Random random = new Random();
        return random.nextInt(1000) + " " + streets[random.nextInt(streets.length)] + ", " + cities[random.nextInt(cities.length)];
    }

}
