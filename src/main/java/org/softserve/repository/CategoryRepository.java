package org.softserve.repository;

import org.softserve.model.Category;

import java.util.List;

public interface CategoryRepository {
    Category create(Category category);

    Category read(int id);

    void update(Category category);

    void delete(Category category);

    List<Category> findAll();
}
