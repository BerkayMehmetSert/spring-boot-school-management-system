package com.bms.schoolmanagementsystem.dto.request.address;

import com.bms.schoolmanagementsystem.helper.ValidationMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class CreateAddressRequest extends BaseAddressRequest {
    @NotNull(message = ValidationMessage.Address.ADDRESS_STUDENT_ID_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Address.ADDRESS_STUDENT_ID_NOT_EMPTY)
    private String studentId;
}
