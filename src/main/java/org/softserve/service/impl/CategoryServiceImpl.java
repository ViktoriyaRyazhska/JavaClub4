package org.softserve.service.impl;

import org.softserve.model.Category;
import org.softserve.repository.CategoryRepository;
import org.softserve.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl (CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

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
    public void delete(Category category) {
        categoryRepository.delete(category);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
