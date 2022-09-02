package com.ritesh.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ritesh.microservice.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
