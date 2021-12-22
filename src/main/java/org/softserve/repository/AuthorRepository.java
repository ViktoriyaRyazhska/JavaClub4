package org.softserve.repository;

import org.softserve.model.Author;

import java.util.List;

public interface AuthorRepository {
    Author saveAuthor(Author author);

    Author read(int id);

    void update(Author author);

    void delete(int id);

    List<Author> findAll();
}

//    @Query(value = "SELECT ",
//            nativeQuery = true) // bad practice!
//    Author getById (@Param("id") Integer id);
//}
//// create Self repo //
