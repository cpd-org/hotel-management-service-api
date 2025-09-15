package com.cpd.hotel_system.hotel_management_service_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpd.hotel_system.hotel_management_service_api.entity.Facility;

public interface FacilityRepo extends JpaRepository<Facility, Long>{

}