package com.bms.schoolmanagementsystem.dto.converter;

import com.bms.schoolmanagementsystem.dto.ClassroomStudentDto;
import com.bms.schoolmanagementsystem.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClassroomStudentDtoConverter {
    public ClassroomStudentDto convert(Student from){
        return new ClassroomStudentDto(
                from.getId(),
                from.getFirstName(),
                from.getLastName(),
                from.getNationalId(),
                from.getStudentNumber()
        );
    }

    public List<ClassroomStudentDto> convert(List<Student> from){
        return from.stream().map(this::convert).collect(Collectors.toList());
    }
}
