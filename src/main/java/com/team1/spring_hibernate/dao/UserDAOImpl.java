package com.team1.spring_hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.team1.spring_hibernate.entity.User;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<User> getAllUser() {
        Session session = sessionFactory.getCurrentSession();
        List<User> allUsers = session.createQuery("from User", User.class).getResultList();
        return allUsers;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public User getUserByID(int id) {
        return null;
    }

    @Override
    public void deleteUserByID(int id) {

    }

    @Override
    public User getUserBooksReadedByName(String name) {
        return null;
    }

    @Override
    public int dateDiffUserByID(String name) {
        return 0;
    }
}
