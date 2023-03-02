package com.demo.ecommerce.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateNewGuarenteeRequests {

    private String by;
    private int duration;

}
