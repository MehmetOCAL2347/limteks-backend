package com.demo.ecommerce.business.concretes;

import com.demo.ecommerce.business.abstracts.BulletPointService;
import com.demo.ecommerce.business.requests.CreateNewBulletPointRequest;
import com.demo.ecommerce.business.responses.GetAllBulletPointsResponse;
import com.demo.ecommerce.business.responses.GetAllCategoriesResponse;
import com.demo.ecommerce.core.utilities.mappers.ModelMapperService;
import com.demo.ecommerce.dataAccess.BulletPointRepository;
import com.demo.ecommerce.entities.concretes.BulletPoint;
import com.demo.ecommerce.entities.concretes.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BulletPointManager implements BulletPointService {

    private BulletPointRepository bulletPointRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllBulletPointsResponse> getAllBulletPoints() {
        List<BulletPoint> bulletPoints = this.bulletPointRepository.findAll();

        List<GetAllBulletPointsResponse> bulletPointsResponses = bulletPoints
                .stream()
                .map(bulletPoint -> this.modelMapperService.forResponse().map(bulletPoint, GetAllBulletPointsResponse.class))
                .collect(Collectors.toList());

        return bulletPointsResponses;
    }

    @Override
    public void createNewBulletPoint(CreateNewBulletPointRequest createNewBulletPointRequest) {
        BulletPoint bulletPoint = this.modelMapperService.forRequests().map(createNewBulletPointRequest, BulletPoint.class);
        this.bulletPointRepository.save(bulletPoint);
    }
}
