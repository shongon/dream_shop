package com.shongon.dreamshop.service.product;

import com.shongon.dreamshop.model.Product;
import com.shongon.dreamshop.request.AddProductRequest;
import com.shongon.dreamshop.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    // Add new Product to DB
    Product addProduct(AddProductRequest product);

    //Get all product
    List<Product> getAllProducts();

    //Get all product by Category ID
    List<Product> getAllProductsByCategory(String category);

    //Get all product by brand name
    List<Product> getAllProductsByBrand(String brand);

    //Get all product by category and brand
    List<Product> getAllProductsByCategoryAndBrand(String category, String brand);

    //Get all product by name
    List<Product> getAllProductsByName(String name);

    //Get all product by brand and name
    List<Product> getAllProductsByBrandAndName(String brand, String name);

    //Get product by ID
    Product getProductById(Long id);

    //Update product by ID
    Product updateProduct(ProductUpdateRequest product, Long productId);

    //Delete product by ID
    void deleteProductById(Long id);

    //Count product by brand and name
    Long countProductsByBrandAndName(String brand, String name);
}
