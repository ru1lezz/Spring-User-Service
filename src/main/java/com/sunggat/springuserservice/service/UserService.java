package com.sunggat.springuserservice.service;

import com.sunggat.springuserservice.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void saveUser(User user);
    void deleteUser(int theId);
    User findByEmail(String email);
}
