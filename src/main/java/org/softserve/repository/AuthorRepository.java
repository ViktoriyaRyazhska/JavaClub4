package org.softserve.repository;

import org.softserve.model.Author;

public interface AuthorRepository {
    Author create(Author author);

    Author read(int id);

    void update(Author author);

    void delete(Author author);
}

//    @Query(value = "SELECT ",
//            nativeQuery = true) // bad practice!
//    Author getById (@Param("id") Integer id);
//}
//// create Self repo //
