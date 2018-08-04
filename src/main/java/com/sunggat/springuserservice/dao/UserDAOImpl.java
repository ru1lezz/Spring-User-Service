package com.sunggat.springuserservice.dao;

import com.sunggat.springuserservice.entity.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(int id) {
        entityManager.createQuery("delete from User u where u.id =:id").setParameter("id", id).executeUpdate();
    }

    @Override
    public User findByEmail(String email) {
        return entityManager.createQuery("select u from User u where u.email =:email", User.class)
                .setParameter("email", email)
                .getSingleResult();
    }
}
