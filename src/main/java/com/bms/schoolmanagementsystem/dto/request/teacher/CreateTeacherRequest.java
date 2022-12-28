package com.bms.schoolmanagementsystem.dto.request.teacher;

import com.bms.schoolmanagementsystem.helper.ValidationMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class CreateTeacherRequest extends BaseTeacherRequest {
    @NotNull(message = ValidationMessage.Teacher.TEACHER_NATIONAL_ID_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Teacher.TEACHER_NATIONAL_ID_NOT_EMPTY)
    @Pattern(regexp = ValidationMessage.General.NATIONAL_ID_REGEX,
            message = ValidationMessage.Teacher.TEACHER_NATIONAL_ID_NOT_VALID)
    private String nationalId;
}
