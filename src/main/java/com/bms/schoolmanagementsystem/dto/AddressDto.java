package com.bms.schoolmanagementsystem.dto;

public record AddressDto(
    String id,
    String street,
    String city,
    String state,
    String zipCode
) {
}
