package com.sunggat.springuserservice.dao;

import com.sunggat.springuserservice.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
    void saveUser(User user);
    void deleteUser(int theId);
    User findByEmail(String email);
}
