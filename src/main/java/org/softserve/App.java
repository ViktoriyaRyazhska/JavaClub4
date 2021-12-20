package org.softserve;

import org.softserve.model.Author;
import org.softserve.model.Book;
import org.softserve.model.Category;
import org.softserve.repository.AuthorRepository;
import org.softserve.repository.impl.AuthorRepositoryImpl;
import org.softserve.service.impl.AuthorServiceImpl;

import java.time.LocalDateTime;
import java.util.Set;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AuthorRepository authorRepository = new AuthorRepositoryImpl();
        AuthorServiceImpl authorService = new AuthorServiceImpl(authorRepository);
        Author author = new Author("FS", "LS");
        authorService.create(author);
        Book book = new Book("tit", new Category(), LocalDateTime.now(), 4);
        book.setAuthors((Set<Author>) author);
        author.setBooks((Set<Book>) book);
        authorService.update(author);


    }

    AuthorRepository authorRepository = new AuthorRepositoryImpl();

}
