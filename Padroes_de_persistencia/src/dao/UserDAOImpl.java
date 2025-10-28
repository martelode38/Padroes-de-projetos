package dao;

import java.util.*;
import model.User;
/*
 * Implementação concreta do padrão DAO para a entidade User.
 * Simulando um bd com um HashMap em memória.
 */
public class UserDAOImpl implements UserDAO {
    private final Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.getName(), user);
        System.out.println("Usuário salvo: " + user);
    }

    @Override
    public User findByName(String name) {
        return users.get(name);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}
