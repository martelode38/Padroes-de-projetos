package dao;

import java.util.List;

import model.User;
/*
 * interface dao que define as operações basicas de persistencia
 * e consulta de usuarios.
 */
public interface UserDAO {
    void save(User user);
    User findByName(String name);
    List<User> findAll();
}
