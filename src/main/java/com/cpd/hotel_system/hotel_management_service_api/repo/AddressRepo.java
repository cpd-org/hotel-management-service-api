package com.cpd.hotel_system.hotel_management_service_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpd.hotel_system.hotel_management_service_api.entity.Address;

public interface AddressRepo extends JpaRepository<Address, String> {

}
