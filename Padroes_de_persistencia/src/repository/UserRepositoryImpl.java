package repository;

import java.util.*;
import model.User;

public class UserRepositoryImpl implements UserRepository {
    
    private final Map<Integer, User> users = new HashMap<>();
    private int idCounter = 1;

    @Override
    public void save(User user) {
        if (user.getId() == null) {
            user.setId(idCounter++);
        }
        users.put(user.getId(), user);
        System.out.println("Usuário salvo com sucesso: " + user);
    }

    @Override
    public Optional<User> findById(Integer id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void delete(Integer id) {
        users.remove(id);
        System.out.println("Usuário removido com id: " + id);
    }
}
