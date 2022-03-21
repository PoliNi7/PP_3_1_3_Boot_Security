package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;

public interface UserService {
    List<User> getListUsers();
    User getUserById(long id);
    User getUserByEmail(String email);
    void addUser(User user);
    void updateUser(User newUser);
    void deleteUser(long id);
}
