package com.udaan.interview.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "deals")
@Getter
@Setter
public class Deals {

    @Id
    private final UUID id = UUID.randomUUID();

    @Column(name = "time_period")
    private Integer timePeriod;

    @Column(name = "items_count")
    private Integer itemsCount;

    @Column(name = "price")
    private  double price;

    @Column(name = "is_active")
    private boolean isActive;

}
