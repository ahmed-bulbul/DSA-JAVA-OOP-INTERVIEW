package books.optional;

import java.util.Optional;

public class UserService {
    UserRepository userRepository = new UserRepository() {
        @Override
        public Optional<User> findOne(long id) {
            return Optional.empty();
        }
    };

    public User findUserById(long id) throws UserNotFoundException {
        Optional<User> optionalUser = userRepository.findOne(101L);
        if(optionalUser.isEmpty()){
            throw new UserNotFoundException("User Not found!!");
        }
        return optionalUser.get();
    }

    // more shortly
    public User findUserById2(long id) throws UserNotFoundException {
        return userRepository.findOne(101L).orElseThrow(()-> new UserNotFoundException("User Not found!!"));
    }

    public Optional<User> finById(Long id){
        return userRepository.findOne(id);
    }

    // find login from user object
    Optional<User> optionalUser = finById(10L);
    Optional<String> optionalLogin = optionalUser.map(u->u.getLogin());
    //or
    Optional<String> optionalLogin2 = optionalUser.map(User::getLogin);

    Optional<Person> optionalPerson = findByPersonId(10L);

    Optional<Optional<SmartPhone>> optionalSmartPhone
            = optionalPerson.map(Person::getSmartPhone);


    private Optional<Person> findByPersonId(long l) {
        return Optional.empty();
    }


    Optional<Person> optionalPerson2 = findByPersonId(1L);
    Optional<SmartPhone> optionalSmartPhone2 = optionalPerson2.flatMap(person -> person.getSmartPhone());


    public Optional<EWallet> getEWalletAccountNumber(Person person){
        return Optional.ofNullable(person)
                .flatMap(Person::getSmartPhone)
                .flatMap(SmartPhone::getEWallet);
    }





    private Person finPersonByName(String james) {
        return new Person();
    }


    public static void main(String[] args) {

        UserService service = new UserService();
        System.out.println(service.getEWalletAccountNumber(new Person()));

        Person p = new Person();
        p = p.finPersonByName("James");
        if(p!=null && "male".equals(p.getSex())){
           // doSomething();
        }

        Optional.ofNullable(p.finPersonByName("James"))
                .filter(person -> "male".equals(person.getSex()))
                .ifPresent((person)->{
                    //doSomething();
                });


    }
}
