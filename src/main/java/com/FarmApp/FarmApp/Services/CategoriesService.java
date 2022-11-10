package com.FarmApp.FarmApp.Services;

import com.FarmApp.FarmApp.Entities.Category;
import com.FarmApp.FarmApp.Repositories.CategoriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService {

    private final CategoriesRepository categoriesRepository;

    public CategoriesService(CategoriesRepository categoriesRepository){
        this.categoriesRepository = categoriesRepository;
    }

    public List<Category> getCategories(){
        return categoriesRepository.findAll();
    }

    public void createCategory(Category category){
        categoriesRepository.save(category);
    }

    public void updateCategory(Long id, Category category) {
        Category categoryToUpdate = categoriesRepository.findById(id).orElseThrow(() -> new IllegalStateException(String.format("ceva")));
        categoryToUpdate.setName(category.getName());
        categoryToUpdate.setImage(category.getImage());
        categoriesRepository.save(categoryToUpdate);
    }

    public void deleteCategory(Long id){
        categoriesRepository.deleteById(id);
    }
}
