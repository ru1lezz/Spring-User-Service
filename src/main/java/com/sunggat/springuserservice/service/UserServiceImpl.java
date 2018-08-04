package com.sunggat.springuserservice.service;

import com.sunggat.springuserservice.dao.UserDAO;
import com.sunggat.springuserservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    @Transactional
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        String encodedPassword =  bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userDAO.saveUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(int theId) {
        userDAO.deleteUser(theId);
    }

    @Transactional
    @Override
    public User findByEmail(String email) {
        return userDAO.findByEmail(email);
    }

}
