package DomainServices;

import Models.User;

import java.util.List;
import java.util.UUID;

public interface Repository {

    void create(User user);
    User read(UUID userID);
    List<User> readAll();
    void update(User user);
    void delete(UUID userID);
    void hardDelete(UUID userID);
}
