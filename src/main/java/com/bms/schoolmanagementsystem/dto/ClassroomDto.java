package com.bms.schoolmanagementsystem.dto;

import java.util.List;

public record ClassroomDto(
    String id,
    String name,
    String description,
    String teacherId,
    List<ClassroomStudentDto> studentList
) {
}
