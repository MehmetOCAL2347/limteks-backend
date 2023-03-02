package com.demo.ecommerce.business.concretes;

import com.demo.ecommerce.business.abstracts.GuarenteeService;
import com.demo.ecommerce.business.requests.CreateNewGuarenteeRequests;
import com.demo.ecommerce.business.responses.GetAllGuarenteesResponse;
import com.demo.ecommerce.core.utilities.mappers.ModelMapperService;
import com.demo.ecommerce.dataAccess.GuarenteeRepository;
import com.demo.ecommerce.entities.concretes.Guarentee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GuarenteeManager implements GuarenteeService {

    private ModelMapperService modelMapperService;
    private GuarenteeRepository guarenteeRepository;

    @Override
    public void createNewGuarentee(CreateNewGuarenteeRequests createNewGuarenteeRequests) {
        Guarentee guarentee = this.modelMapperService.forRequests().map(createNewGuarenteeRequests, Guarentee.class);
        System.out.println(guarentee);
        this.guarenteeRepository.save(guarentee);
    }

    @Override
    public List<GetAllGuarenteesResponse> getAllGuarentees() {
        List<Guarentee> guarentees = guarenteeRepository.findAll();

        List<GetAllGuarenteesResponse> guarenteesResponses = guarentees.stream()
                .map(guarentee -> this.modelMapperService.forResponse().map(guarentee, GetAllGuarenteesResponse.class))
                .collect(Collectors.toList());

        return guarenteesResponses;
    }
}
