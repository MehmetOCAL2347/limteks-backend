package com.demo.ecommerce.business.abstracts;

import com.demo.ecommerce.business.requests.CreateImageRequest;

public interface ImageService {
    void createNewImage(CreateImageRequest createImageRequest);
}
