package com.demo.ecommerce.webApi.controllers;

import com.demo.ecommerce.business.abstracts.GuarenteeService;
import com.demo.ecommerce.business.requests.CreateNewGuarenteeRequests;
import com.demo.ecommerce.business.responses.GetAllGuarenteesResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/guarentees")
public class GuarenteeController {

    private GuarenteeService guarenteeService;

    @PostMapping("/createNewGuarentee")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createNewGuarentee(@RequestBody CreateNewGuarenteeRequests createNewGuarenteeRequests){
        this.guarenteeService.createNewGuarentee(createNewGuarenteeRequests);
    }

    @GetMapping()
    public List<GetAllGuarenteesResponse> getAllGuarentees(){
        return guarenteeService.getAllGuarentees();
    }

}
