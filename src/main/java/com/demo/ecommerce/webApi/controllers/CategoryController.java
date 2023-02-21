package com.demo.ecommerce.webApi.controllers;

import com.demo.ecommerce.business.abstracts.CategoryService;
import com.demo.ecommerce.business.requests.CreateNewCategoryRequests;
import com.demo.ecommerce.business.requests.UpdateCategoryRequests;
import com.demo.ecommerce.business.responses.GetAllCategoriesResponse;
import com.demo.ecommerce.business.responses.GetByIdCategoryResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/update")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void updateCategory(@RequestBody UpdateCategoryRequests updateCategoryRequests){
        this.categoryService.updateCategory(updateCategoryRequests);
    }

    @PostMapping("/createNewCategory")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createNewCategory(@RequestBody CreateNewCategoryRequests createNewCategoryRequests){
        this.categoryService.createNewCategory(createNewCategoryRequests);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void deleteCategoryById(@PathVariable int id){
        this.categoryService.deleteCategory(id);
    }

}
