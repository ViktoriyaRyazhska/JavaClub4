package org.softserve.service;

import org.softserve.model.Category;

import java.util.List;

public interface CategoryService {

    Category create(Category category);

    Category readById(int id);

    Category update(Category category);

    void delete(int id);

    List<Category> getAll();
}
