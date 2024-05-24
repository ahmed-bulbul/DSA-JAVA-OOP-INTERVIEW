package books.optional;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findOne(long id);
}
