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

    public static void main(String[] args) {

    }
}
