package com.demo.ecommerce.webApi.controllers;

import com.demo.ecommerce.business.abstracts.ImageService;
import com.demo.ecommerce.business.requests.CreateImageRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/images")
public class ImageController {

    private ImageService imageService;

    @PostMapping("/createNewImage")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewImage(@RequestBody CreateImageRequest createImageRequest){
        this.imageService.createNewImage(createImageRequest);
    }

}
