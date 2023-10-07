package DomainServices;

import Model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserRepository implements Repository{
    private Map<UUID, User> users = new HashMap<>();
    @Override
    public void create(User user) {
        users.put(user.getId(), user);

    }

    @Override
    public void read() {

    }

    @Override
    public void readAll() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void hardDelete() {

    }
}
