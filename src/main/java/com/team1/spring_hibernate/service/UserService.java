package com.team1.spring_hibernate.service;

import com.team1.spring_hibernate.entity.Role;
import com.team1.spring_hibernate.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUser();

    public void saveUser(User user);

    public User getUserByID(int id);

    public void deleteUserByID(int id);

    public User getUserBooksReadedByName(String name); // get User by Name

    public int dateDiffUserByID(String name);


}
