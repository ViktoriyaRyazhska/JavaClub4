package org.softserve.repository;

import org.softserve.model.Category;

public interface CategoryRepository {
    Category create(Category category);

    void read(int id);

    void update(Category category);

    void delete(int id);
}
