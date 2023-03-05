package com.demo.ecommerce.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateImageRequest {

    private String mainImageUrl;
    // product id eklenecek

}
