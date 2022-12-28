package com.bms.schoolmanagementsystem.dto.request.teacher;

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
public class BaseTeacherRequest {
    @NotNull(message = ValidationMessage.Teacher.TEACHER_FIRST_NAME_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Teacher.TEACHER_FIRST_NAME_NOT_EMPTY)
    private String firstName;

    @NotNull(message = ValidationMessage.Teacher.TEACHER_LAST_NAME_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Teacher.TEACHER_LAST_NAME_NOT_EMPTY)
    private String lastName;
    @NotNull(message = ValidationMessage.Teacher.TEACHER_PHONE_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Teacher.TEACHER_PHONE_NOT_EMPTY)
    @Pattern(regexp = ValidationMessage.General.PHONE_REGEX,
            message = ValidationMessage.Teacher.TEACHER_PHONE_NOT_VALID)
    private String phone;

}
