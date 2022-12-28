package com.bms.schoolmanagementsystem.dto.converter;

import com.bms.schoolmanagementsystem.dto.AddressDto;
import com.bms.schoolmanagementsystem.model.Address;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AddressDtoConverter {
    public AddressDto convert(Address from){
        return new AddressDto(
                from.getId(),
                from.getStreet(),
                from.getCity(),
                from.getState(),
                from.getZipCode()
        );
    }

    public List<AddressDto> convert(List<Address> from){
        return from.stream().map(this::convert).collect(Collectors.toList());
    }
}
