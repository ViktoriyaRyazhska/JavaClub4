package com.team1.spring_hibernate.dao;

import com.team1.spring_hibernate.entity.Author;

import java.util.List;

public interface AuthorDAO {

    public List<Author> getAllAuthor();

    public void saveAuthor(Author author);

    public Author getAuthorByID(int id);

    public void deleteAuthorByID(int id);

    public Author getAuthorByName(String name); // get Author by Name

}
