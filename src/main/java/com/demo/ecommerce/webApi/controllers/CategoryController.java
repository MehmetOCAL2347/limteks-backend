package com.demo.ecommerce.webApi.controllers;

import com.demo.ecommerce.business.abstracts.CategoryService;
import com.demo.ecommerce.business.responses.GetAllCategoriesResponse;
import com.demo.ecommerce.business.responses.GetByIdCategoryResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    @GetMapping()
    public List<GetAllCategoriesResponse> getAllCategories(){
        return this.categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public GetByIdCategoryResponse getByIdCategoryResponse(@PathVariable int id){
        System.out.println(id);
        return this.categoryService.getByIdCategory(id);
    }

}
