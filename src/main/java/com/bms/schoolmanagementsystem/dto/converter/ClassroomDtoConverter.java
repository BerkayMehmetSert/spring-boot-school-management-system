package com.bms.schoolmanagementsystem.dto.converter;

import com.bms.schoolmanagementsystem.dto.ClassroomDto;
import com.bms.schoolmanagementsystem.model.Classroom;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClassroomDtoConverter {
    private final ClassroomStudentDtoConverter classroomStudentDtoConverter;

    public ClassroomDtoConverter(ClassroomStudentDtoConverter classroomStudentDtoConverter) {
        this.classroomStudentDtoConverter = classroomStudentDtoConverter;
    }

    public ClassroomDto convert(Classroom from) {
        return new ClassroomDto(
                from.getId(),
                from.getName(),
                from.getDescription(),
                from.getTeacher().getId(),
                classroomStudentDtoConverter.convert(from.getStudentList())
        );
    }

    public List<ClassroomDto> convert(List<Classroom> from) {
        return from.stream().map(this::convert).collect(Collectors.toList());
    }
}
