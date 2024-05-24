package books.optional;

import java.util.Optional;

public class Person {

    private Optional<SmartPhone> smartPhone;

    public Optional<SmartPhone> getSmartPhone() {
        return smartPhone;
    }

//    public String getEWalletAccountNumber(Person person) {
//        return person.getSmartPhone().getEWallet().getAccountNumber();
//    }

    Optional<Person> person = Optional.ofNullable(findPerson());

    public static Person findPerson(){
        return null;
    }
    Optional<String> myName = Optional.empty();
    String myName2 = null;  // should be avoided
    Optional<String> myString = Optional.ofNullable(getNullableString());
    private String getNullableString() {
        return null;
    }




    public static void main(String[] args) {
        Person person = new Person();
        Optional<Person> personOptional = Optional.of(person);
        System.out.println(personOptional.map(Person::getSmartPhone));

        if(person.myString.isPresent()){
            System.out.println(person.myString.get());
        }

        //by lambda
        person.myString.ifPresent(s-> person.myString.get());
    }

}
