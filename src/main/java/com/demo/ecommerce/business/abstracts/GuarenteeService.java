package com.demo.ecommerce.business.abstracts;

import com.demo.ecommerce.business.requests.CreateNewGuarenteeRequests;
import com.demo.ecommerce.business.responses.GetAllGuarenteesResponse;

import java.util.List;

public interface GuarenteeService {
    void createNewGuarentee(CreateNewGuarenteeRequests createNewGuarenteeRequests);
    List<GetAllGuarenteesResponse> getAllGuarentees();
}
