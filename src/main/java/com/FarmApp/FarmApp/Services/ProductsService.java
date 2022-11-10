package com.FarmApp.FarmApp.Services;

import com.FarmApp.FarmApp.Entities.Product;
import com.FarmApp.FarmApp.Repositories.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository){
        this.productsRepository = productsRepository;
    }

    public List<Product> getProducts(){
        return productsRepository.findAll();
    }

    public void createProduct(Product product){
        productsRepository.save(product);
    }

    public void updateProduct(Long id, Product product) {
        Product productToUpdate = productsRepository.findById(id).orElseThrow(() -> new IllegalStateException(String.format("plm")));
        productToUpdate.setName(product.getName());
        productToUpdate.setImage(product.getImage());
        productToUpdate.setQuantityInput(product.getQuantityInput());
        productToUpdate.setPrice(product.getPrice());
        productToUpdate.setDescription(product.getDescription());
        productToUpdate.setAvailableDate(product.getAvailableDate());
        productToUpdate.setExpirationDate(product.getExpirationDate());
        productToUpdate.setIngredients(product.getIngredients());
        productToUpdate.setAlergens(product.getAlergens());
        productsRepository.save(productToUpdate);
    }

    public void deleteProduct(Long id){
        productsRepository.deleteById(id);
    }
}
