package com.demo.ecommerce.business.responses;

import com.demo.ecommerce.entities.concretes.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllGuarenteesResponse {
    private int id;
    private String by;
    private int duration;
    private List<Product> products;
}
