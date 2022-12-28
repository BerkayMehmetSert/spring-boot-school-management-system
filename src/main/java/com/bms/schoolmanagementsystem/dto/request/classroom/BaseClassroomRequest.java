package com.bms.schoolmanagementsystem.dto.request.classroom;

import com.bms.schoolmanagementsystem.helper.ValidationMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseClassroomRequest {
    @NotNull(message = ValidationMessage.Classroom.CLASSROOM_DESCRIPTION_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Classroom.CLASSROOM_DESCRIPTION_NOT_EMPTY)
    private String description;

    @NotNull(message = ValidationMessage.Classroom.CLASSROOM_TEACHER_ID_NOT_NULL)
    @NotEmpty(message = ValidationMessage.Classroom.CLASSROOM_TEACHER_ID_NOT_EMPTY)
    private String teacherId;
}
