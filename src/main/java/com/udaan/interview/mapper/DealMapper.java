package com.udaan.interview.mapper;

import com.udaan.interview.entity.Deals;
import com.udaan.interview.model.DealRequest;
import org.springframework.stereotype.Component;

@Component
public class DealMapper {
    public Deals createEntityObject(DealRequest request) {
        Deals entity = new Deals();
        entity.setActive(true);
        entity.setItemsCount(request.getItemsCount());
        entity.setPrice(request.getPrice());
        entity.setTimePeriod(2);
        return entity;
    }
}
