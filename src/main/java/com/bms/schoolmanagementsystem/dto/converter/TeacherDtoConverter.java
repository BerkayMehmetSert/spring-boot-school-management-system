package com.bms.schoolmanagementsystem.dto.converter;

import com.bms.schoolmanagementsystem.dto.TeacherDto;
import com.bms.schoolmanagementsystem.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TeacherDtoConverter {
    private final TeacherClassroomDtoConverter teacherClassroomDtoConverter;

    public TeacherDtoConverter(TeacherClassroomDtoConverter teacherClassroomDtoConverter) {
        this.teacherClassroomDtoConverter = teacherClassroomDtoConverter;
    }

    public TeacherDto convert(Teacher from) {
        return new TeacherDto(
                from.getId(),
                from.getFirstName(),
                from.getLastName(),
                from.getNationalId(),
                from.getPhone(),
                teacherClassroomDtoConverter.convert(from.getClassroomList())
        );
    }

    public List<TeacherDto> convert(List<Teacher> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }
}
