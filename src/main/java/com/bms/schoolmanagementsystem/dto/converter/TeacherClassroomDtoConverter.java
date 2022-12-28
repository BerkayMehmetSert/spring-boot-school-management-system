package com.bms.schoolmanagementsystem.dto.converter;

import com.bms.schoolmanagementsystem.dto.TeacherClassroomDto;
import com.bms.schoolmanagementsystem.model.Classroom;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TeacherClassroomDtoConverter {
    public TeacherClassroomDto convert(Classroom from){
        return new TeacherClassroomDto(
                from.getId(),
                from.getName()
        );
    }

    public List<TeacherClassroomDto> convert(List<Classroom> from){
        return from.stream().map(this::convert).collect(Collectors.toList());
    }
}
