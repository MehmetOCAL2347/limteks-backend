package com.demo.ecommerce.webApi.controllers;

import com.demo.ecommerce.business.abstracts.BulletPointService;
import com.demo.ecommerce.business.requests.CreateNewBulletPointRequest;
import com.demo.ecommerce.business.responses.GetAllBulletPointsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bulletPoints")
public class BulletPointController {

    private BulletPointService bulletPointService;

    @PostMapping("/createNewBulletPoint")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewBulletPoint(@RequestBody CreateNewBulletPointRequest createNewBulletPointRequest){
        this.bulletPointService.createNewBulletPoint(createNewBulletPointRequest);
    }

    @GetMapping()
    public List<GetAllBulletPointsResponse> getAllBulletPointsResponse(){
        return this.bulletPointService.getAllBulletPoints();
    }

}
