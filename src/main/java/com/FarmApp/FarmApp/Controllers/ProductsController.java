package com.FarmApp.FarmApp.Controllers;

import com.FarmApp.FarmApp.Entities.Category;
import com.FarmApp.FarmApp.Entities.Product;
import com.FarmApp.FarmApp.Services.ProductsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/farmapp/v1/products")
public class ProductsController {

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService){
        this.productsService = productsService;
    }

    @GetMapping
    public List<Product> getProducts(){
        return productsService.getProducts();
    }

    @PostMapping
    public void createProduct(@RequestBody Product product) {
        productsService.createProduct(product);
    }

    @PutMapping(path = "{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody Product product) {
        productsService.updateProduct(id, product);
    }

    @DeleteMapping(path = "{id}")
    public void deleteProduct(@PathVariable Long id){
        productsService.deleteProduct(id);
    }
}
