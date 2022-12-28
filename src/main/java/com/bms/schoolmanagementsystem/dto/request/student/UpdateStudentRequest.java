package com.bms.schoolmanagementsystem.dto.request.student;

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
public class UpdateStudentRequest extends BaseStudentRequest {
    @NotNull(message = ValidationMessage.Student.STUDENT_CLASSROOM_ID_NOT_EMPTY)
    @NotEmpty(message = ValidationMessage.Student.STUDENT_CLASSROOM_ID_NOT_EMPTY)
    private String classroomId;
}
