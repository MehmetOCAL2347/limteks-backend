package com.demo.ecommerce.business.abstracts;

import com.demo.ecommerce.business.responses.GetAllCategoriesResponse;
import com.demo.ecommerce.business.responses.GetByIdCategoryResponse;

import java.util.List;

public interface CategoryService {
    List<GetAllCategoriesResponse> getAllCategories();
    GetByIdCategoryResponse getByIdCategory(int id);
}
