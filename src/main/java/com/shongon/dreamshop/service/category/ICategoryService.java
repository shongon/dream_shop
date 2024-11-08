package com.shongon.dreamshop.service.category;

import com.shongon.dreamshop.model.Category;

import java.util.List;

public interface ICategoryService {
    //Get category by ID
    Category getCategoryById (Long id);

    //Get category by name
    Category getCategoryByName (String name);

    //Get all categories
    List<Category> getAllCategories();

    //Add new category
    Category addCategory (Category category);

    //Update exist category
    Category updateCategory (Category category);

    //Delete exist category
    void deleteCategory (Long id);

}
