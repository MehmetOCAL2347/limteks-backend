package com.demo.ecommerce.business.concretes;

import com.demo.ecommerce.business.abstracts.CollectionService;
import com.demo.ecommerce.business.requests.CreateNewCollectionRequests;
import com.demo.ecommerce.business.responses.GetAllCollectionsResponse;
import com.demo.ecommerce.business.responses.GetAllGuarenteesResponse;
import com.demo.ecommerce.core.utilities.mappers.ModelMapperService;
import com.demo.ecommerce.dataAccess.CollectionRepository;
import com.demo.ecommerce.entities.concretes.Collection;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CollectionManager implements CollectionService {

    private ModelMapperService modelMapperService;
    private CollectionRepository collectionRepository;

    @Override
    public void createNewCollection(CreateNewCollectionRequests createNewCollectionRequests) {
        Collection collection = this.modelMapperService.forRequests().map(createNewCollectionRequests, Collection.class);
        this.collectionRepository.save(collection);
    }

    @Override
    public List<GetAllCollectionsResponse> getAllCollections() {
        List<Collection> collections = this.collectionRepository.findAll();

        List<GetAllCollectionsResponse> collectionsResponses = collections.stream()
                .map(collection -> this.modelMapperService.forResponse().map(collection, GetAllCollectionsResponse.class))
                .collect(Collectors.toList());

        System.out.println(collectionsResponses);

        return collectionsResponses;
    }
}
