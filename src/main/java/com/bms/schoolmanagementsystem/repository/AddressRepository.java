package com.bms.schoolmanagementsystem.repository;

import com.bms.schoolmanagementsystem.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
}