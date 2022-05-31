package com.udaan.interview.repository;

import com.udaan.interview.entity.Deals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DealRepository extends JpaRepository<Deals, UUID> {
}
