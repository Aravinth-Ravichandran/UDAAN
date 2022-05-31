package com.udaan.interview.controller;

import com.udaan.interview.model.DealRequest;
import com.udaan.interview.model.DealUpdateRequest;
import com.udaan.interview.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class DealController {

    @Autowired
    private DealService dealService;

    @RequestMapping(value = "/api/deal", method = RequestMethod.POST, consumes = "application/json")
    public UUID createDeal( @RequestBody  DealRequest request) {
        return dealService.createDeal(request);
    }

    @RequestMapping(value = "api/deal/{id}", method = RequestMethod.DELETE)
    public boolean deleteDeal(@PathVariable UUID id){
        return dealService.deleteDeal(id);
    }

    @RequestMapping(value = "api/deal/{id}", method = RequestMethod.PATCH)
    public UUID updateDeal(@RequestBody DealUpdateRequest request, @PathVariable UUID id){
        return dealService.updateDeal(request,id);
    }
}
