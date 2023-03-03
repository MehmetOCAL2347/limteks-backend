package com.demo.ecommerce.business.abstracts;

import com.demo.ecommerce.business.requests.CreateNewCollectionRequests;
import com.demo.ecommerce.business.responses.GetAllCollectionsResponse;

import java.util.List;

public interface CollectionService {

    void createNewCollection(CreateNewCollectionRequests createNewCollectionRequests);
    List<GetAllCollectionsResponse> getAllCollections();

}
