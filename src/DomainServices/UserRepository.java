package DomainServices;

import Models.User;

import java.util.*;

import static Constants.Status.DELETED;

public class UserRepository implements Repository{
    private Map<UUID, User> users;
    private static Repository repository;

    private UserRepository(){
        this.users = new HashMap<>();
    }

    public static Repository getInstance(){
        if(repository == null){
            repository = new UserRepository();
        }
        return repository;
    }

    @Override
    public void create(User user) {
        if(users.containsKey(user.getId())) {
            System.out.println("Пользователь с ID=" + user.getId() + " уже существует!");
        } else {
            users.put(user.getId(), user);
            System.out.println("Пользователь с ID=" + user.getId() + " успешно создан!");
        }
    }

    @Override
    public User read(UUID userID) {
        if(users.containsKey(userID)) {
            return users.get(userID);
        } else {
            System.out.println("Пользователя с указанным ID не существует!");
            return null;
        }
    }

    @Override
    public List<User> readAll() {
        if(users.isEmpty()){
            System.out.println("Список пользователей пуст!");
            return null;
        } else {
            return new ArrayList<>(users.values());
        }
    }

    @Override
    public void update(User user) {
        if(users.containsKey(user.getId())) {
            users.replace(user.getId(), user);
            System.out.println("Пользователь с ID=" + user.getId() + " успешно обновлен!");
        } else {
            System.out.println("Пользователя с указанным ID не существует!");
        }
    }

    @Override
    public void delete(UUID userID) {
        if(users.containsKey(userID)) {
            users.get(userID).setStatus(DELETED);
            System.out.println("Статус пользователя с ID=" + userID + " изменен на \"" + DELETED + "\"");
        } else {
            System.out.println("Пользователь с ID=" + userID + " не существует!");
        }
    }

    @Override
    public void hardDelete(UUID userID) {
        if(users.containsKey(userID)) {
            users.remove(userID);
            System.out.println("Пользователя с ID=" + userID + " удален из системы");
        } else {
            System.out.println("Пользователь с ID=" + userID + " не существует!");
        }

    }

}
