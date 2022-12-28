package com.bms.schoolmanagementsystem.dto.request.address;

import com.bms.schoolmanagementsystem.helper.ValidationMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseAddressRequest {
    @NotNull(message = ValidationMessage.Address.ADDRESS_STREET_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Address.ADDRESS_STREET_NOT_EMPTY)
    private String street;

    @NotNull(message = ValidationMessage.Address.ADDRESS_CITY_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Address.ADDRESS_CITY_NOT_EMPTY)
    private String city;

    @NotNull(message = ValidationMessage.Address.ADDRESS_STATE_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Address.ADDRESS_STATE_NOT_EMPTY)
    private String state;

    @NotNull(message = ValidationMessage.Address.ADDRESS_ZIPCODE_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Address.ADDRESS_ZIPCODE_NOT_EMPTY)
    private String zipCode;
}
