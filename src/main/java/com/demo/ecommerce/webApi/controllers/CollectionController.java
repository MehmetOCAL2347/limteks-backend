package com.demo.ecommerce.webApi.controllers;

import com.demo.ecommerce.business.abstracts.CollectionService;
import com.demo.ecommerce.business.requests.CreateNewCollectionRequests;
import com.demo.ecommerce.business.responses.GetAllCollectionsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/collections")
public class CollectionController {

    private CollectionService collectionService;

    @PostMapping("/createNewCollection")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createNewCollection(@RequestBody CreateNewCollectionRequests createNewCollectionRequests){
        this.collectionService.createNewCollection(createNewCollectionRequests);
    }

    @GetMapping()
    public List<GetAllCollectionsResponse> getAllCollections(){
        return this.collectionService.getAllCollections();
    }

}
