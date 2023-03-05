package com.demo.ecommerce.business.abstracts;


import com.demo.ecommerce.business.requests.CreateNewBulletPointRequest;
import com.demo.ecommerce.business.responses.GetAllBulletPointsResponse;

import java.util.List;

public interface BulletPointService{
    List<GetAllBulletPointsResponse> getAllBulletPoints();
    void createNewBulletPoint(CreateNewBulletPointRequest createNewBulletPointRequest);
}
