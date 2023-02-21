package com.demo.ecommerce.business.concretes;

import com.demo.ecommerce.business.abstracts.CategoryService;
import com.demo.ecommerce.business.requests.UpdateCategoryRequests;
import com.demo.ecommerce.business.responses.GetAllCategoriesResponse;
import com.demo.ecommerce.business.responses.GetByIdCategoryResponse;
import com.demo.ecommerce.core.utilities.mappers.ModelMapperService;
import com.demo.ecommerce.dataAccess.CategoryRepository;
import com.demo.ecommerce.entities.concretes.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {

    private CategoryRepository categoryRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllCategoriesResponse> getAllCategories() {

        List<Category> categories = this.categoryRepository.findAll();
        List<GetAllCategoriesResponse> categoriesResponses = categories
                .stream()
                .map(category -> this.modelMapperService.forResponse().map(category, GetAllCategoriesResponse.class))
                .collect(Collectors.toList());

        return categoriesResponses;
    }

    @Override
    public GetByIdCategoryResponse getByIdCategory(int id) {
        Category category = this.categoryRepository.findById(id).orElseThrow();
        GetByIdCategoryResponse response = this.modelMapperService.forResponse().map(category, GetByIdCategoryResponse.class);
        return response;
    }

    @Override
    public void updateCategory(UpdateCategoryRequests updateCategoryRequests) {
        Category category = this.modelMapperService.forRequests().map(updateCategoryRequests, Category.class);
        this.categoryRepository.save(category);
    }
}
