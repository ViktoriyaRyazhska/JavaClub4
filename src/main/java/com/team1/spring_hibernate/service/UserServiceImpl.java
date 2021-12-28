package com.team1.spring_hibernate.service;

import com.team1.spring_hibernate.dao.UserDAO;
import com.team1.spring_hibernate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;


    @Override
    @Transactional
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    @Transactional
    public void saveUser(User user) {

    }

    @Override
    @Transactional
    public User getUserByID(int id) {
        return null;
    }

    @Override
    @Transactional
    public void deleteUserByID(int id) {

    }

    @Override
    @Transactional
    public User getUserBooksReadedByName(String name) {
        return null;
    }

    @Override
    @Transactional
    public int dateDiffUserByID(String name) {
        return 0;
    }
}
