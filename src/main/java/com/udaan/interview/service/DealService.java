package com.udaan.interview.service;

import com.udaan.interview.entity.Deals;
import com.udaan.interview.exceptions.DealCreationException;
import com.udaan.interview.mapper.DealMapper;
import com.udaan.interview.model.DealRequest;
import com.udaan.interview.model.DealUpdateRequest;
import com.udaan.interview.repository.DealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DealService {

    @Autowired
    private DealRepository dealRepository;

    @Autowired
    private DealMapper dealMapper;

    public UUID createDeal(DealRequest request) {
        try {
            Deals entity = dealRepository.save(dealMapper.createEntityObject(request));
            return entity.getId();
        } catch (Exception e) {
            // throw new DealCreationException(e.getMessage());
        }
        return null;
    }

    public boolean deleteDeal(UUID id) {
        try {
            Deals entity = dealRepository.getById(id);
            dealRepository.delete(entity);
            return true;
        } catch (Exception ignored) {

        }
        return false;
    }

    public UUID updateDeal(DealUpdateRequest request, UUID id) {
        try {
            Deals entity = dealRepository.getById(id);
            entity.setTimePeriod(request.getTimePeriod());
            entity.setItemsCount(request.getItemCount());
            return dealRepository.save(entity).getId();
        } catch (Exception ignored) {

        }
        return null;
    }
}
