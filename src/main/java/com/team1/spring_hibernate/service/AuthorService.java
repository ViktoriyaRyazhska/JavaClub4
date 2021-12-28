package com.team1.spring_hibernate.service;

import com.team1.spring_hibernate.entity.Author;
import com.team1.spring_hibernate.entity.User;

import java.util.List;

public interface AuthorService {

    public List<Author> getAllAuthor();

    public void saveAuthor(Author author);

    public Author getAuthorByID(int id);

    public void deleteAuthorByID(int id);

    public Author getAuthorByName(String name); // get Author by Name

}
