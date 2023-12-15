package com.example.demo.dao;

import com.example.demo.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOJpaImpl implements UserDAO{

    private EntityManager entityManager;

    @Autowired
    public UserDAOJpaImpl(EntityManager oneEntityManager){entityManager = oneEntityManager;}

    @Override
    public List<User> findAll() {
        TypedQuery<User> theQuery = entityManager.createQuery("from User", User.class);
        List<User> users = theQuery.getResultList();
        return users;
    }

    @Override
    public User findById(int oneId) {
        User oneUser = entityManager.find(User.class, oneId);
        return oneUser;
    }

    @Override
    public User save(User oneUser) {
        User dbUser = entityManager.merge(oneUser);
        return dbUser;
    }

    @Override
    public void deleteById(int oneId) {
        User oneUser = entityManager.find(User.class, oneId);
        entityManager.remove(oneUser);
    }
}
