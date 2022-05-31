package com.udaan.interview.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class DealRequest {
    private double price;
    private Integer itemsCount;

    public DealRequest(double price, Integer itemsCount) {
        this.price = price;
        this.itemsCount = itemsCount;
    }
}
