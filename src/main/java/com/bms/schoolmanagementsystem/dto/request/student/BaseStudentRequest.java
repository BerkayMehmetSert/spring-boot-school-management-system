package com.bms.schoolmanagementsystem.dto.request.student;

import com.bms.schoolmanagementsystem.helper.ValidationMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseStudentRequest {
    @NotNull(message = ValidationMessage.Student.STUDENT_FIRST_NAME_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Student.STUDENT_FIRST_NAME_NOT_EMPTY)
    private String firstName;

    @NotNull(message = ValidationMessage.Student.STUDENT_LAST_NAME_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Student.STUDENT_LAST_NAME_NOT_EMPTY)
    private String lastName;

    @NotNull(message = ValidationMessage.Student.STUDENT_FATHER_NAME_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Student.STUDENT_FATHER_NAME_NOT_EMPTY)
    private String fatherName;

    @NotNull(message = ValidationMessage.Student.STUDENT_FATHER_PHONE_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Student.STUDENT_FATHER_PHONE_NOT_EMPTY)
    @Pattern(regexp = ValidationMessage.General.PHONE_REGEX,
            message = ValidationMessage.Student.STUDENT_FATHER_PHONE_NOT_VALID)
    private String fatherPhone;

    @NotNull(message = ValidationMessage.Student.STUDENT_MOTHER_NAME_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Student.STUDENT_MOTHER_NAME_NOT_EMPTY)
    private String motherName;

    @NotNull(message = ValidationMessage.Student.STUDENT_MOTHER_PHONE_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Student.STUDENT_MOTHER_PHONE_NOT_EMPTY)
    @Pattern(regexp = ValidationMessage.General.PHONE_REGEX,
            message = ValidationMessage.Student.STUDENT_MOTHER_PHONE_NOT_VALID)
    private String motherPhone;
}
