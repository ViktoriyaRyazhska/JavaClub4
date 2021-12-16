package org.softserve.service.impl;

import org.softserve.model.Category;
import org.softserve.repository.impl.CategoryRepositoryImpl;
import org.softserve.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepositoryImpl categoryRepository;

    @Override
    public Category create(Category category) {
        return categoryRepository.create(category);
    }

    @Override
    public Category readById(int id) {
        return categoryRepository.read(id);
    }

    @Override
    public void update(Category category) {
        categoryRepository.update(category);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Category> getAll() {
        return null;
    }
}
