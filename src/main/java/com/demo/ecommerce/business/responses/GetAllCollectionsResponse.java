package com.demo.ecommerce.business.responses;

import com.demo.ecommerce.entities.concretes.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCollectionsResponse {
    private int id;
    private String year;
    private List<Product> products;
}
