package com.FarmApp.FarmApp.Controllers;

import com.FarmApp.FarmApp.Entities.Category;
import com.FarmApp.FarmApp.Services.CategoriesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/farmapp/v1/categories")
public class CategoriesController {

    private final CategoriesService categoriesService;

    public CategoriesController(CategoriesService categoriesService){
        this.categoriesService = categoriesService;
    }

    @GetMapping
    public List<Category> getCategories(){
        return categoriesService.getCategories();
    }

    @PostMapping
    public void createCategory(@RequestBody Category category) {
        categoriesService.createCategory(category);
    }

    @PutMapping(path = "{id}")
    public void updateCategory(@PathVariable Long id, @RequestBody Category category) {
        categoriesService.updateCategory(id, category);
    }

    @DeleteMapping(path = "{id}")
    public void deleteCategory(@PathVariable Long id){
        categoriesService.deleteCategory(id);
    }
}
