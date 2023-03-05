package com.demo.ecommerce.business.concretes;

import com.demo.ecommerce.business.abstracts.ImageService;
import com.demo.ecommerce.business.requests.CreateImageRequest;
import com.demo.ecommerce.core.utilities.mappers.ModelMapperService;
import com.demo.ecommerce.dataAccess.ImageRepository;
import com.demo.ecommerce.entities.concretes.Image;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ImageManager implements ImageService {

    private ImageRepository imageRepository;
    private ModelMapperService modelMapperService;

    @Override
    public void createNewImage(CreateImageRequest createImageRequest) {
        Image image = this.modelMapperService.forRequests().map(createImageRequest, Image.class);
        this.imageRepository.save(image);
    }
}
