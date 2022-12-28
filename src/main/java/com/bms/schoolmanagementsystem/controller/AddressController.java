package com.bms.schoolmanagementsystem.controller;

import com.bms.schoolmanagementsystem.dto.AddressDto;
import com.bms.schoolmanagementsystem.dto.request.address.CreateAddressRequest;
import com.bms.schoolmanagementsystem.dto.request.address.UpdateAddressRequest;
import com.bms.schoolmanagementsystem.service.AddressService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/addresses")
@Tag(name = "Address", description = "Address API")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @Operation(summary = "Create Address",
            description = "Create Address",
            tags = {"Address"})
    @PostMapping
    public ResponseEntity<Void> createAddress(@Valid CreateAddressRequest request) {
        addressService.createAddress(request);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Address",
            description = "Update Address by id",
            tags = {"Address"})
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateAddress(@PathVariable String id,
                                              @Valid UpdateAddressRequest request) {
        addressService.updateAddress(id, request);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Delete Address",
            description = "Delete Address by Id",
            tags = {"Address"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable String id) {
        addressService.deleteAddress(id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get Address",
            description = "Get Address by Id",
            tags = {"Address"})
    @GetMapping("/{id}")
    public ResponseEntity<AddressDto> findAddressById(@PathVariable String id) {
        return ResponseEntity.ok(addressService.findAddressById(id));
    }

    @Operation(summary = "Get All Addresses",
            description = "Get All Addresses",
            tags = {"Address"})
    @GetMapping
    public ResponseEntity<List<AddressDto>> findAllAddresses() {
        return ResponseEntity.ok(addressService.findAllAddresses());
    }
}
