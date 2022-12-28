package com.bms.schoolmanagementsystem.service;

import com.bms.schoolmanagementsystem.dto.ClassroomDto;
import com.bms.schoolmanagementsystem.dto.converter.ClassroomDtoConverter;
import com.bms.schoolmanagementsystem.dto.request.classroom.CreateClassroomRequest;
import com.bms.schoolmanagementsystem.dto.request.classroom.UpdateClassroomRequest;
import com.bms.schoolmanagementsystem.exception.classroom.ClassroomNotFoundException;
import com.bms.schoolmanagementsystem.helper.BusinessMessage;
import com.bms.schoolmanagementsystem.helper.GenerateClassroomName;
import com.bms.schoolmanagementsystem.helper.LogMessage;
import com.bms.schoolmanagementsystem.model.Classroom;
import com.bms.schoolmanagementsystem.repository.ClassroomRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ClassroomService {
    private final ClassroomRepository classroomRepository;
    private final TeacherService teacherService;
    private final ClassroomDtoConverter converter;

    public ClassroomService(ClassroomRepository classroomRepository,
                            TeacherService teacherService,
                            ClassroomDtoConverter converter) {
        this.classroomRepository = classroomRepository;
        this.teacherService = teacherService;
        this.converter = converter;
    }

    public void createClassroom(CreateClassroomRequest request) {
        Classroom classroom = new Classroom();
        classroom.setName(GenerateClassroomName.generate());
        classroom.setDescription(request.getDescription());
        classroom.setTeacher(teacherService.findTeacherByTeacherId(request.getTeacherId()));

        classroomRepository.save(classroom);
        log.info(LogMessage.Classroom.ClassroomCreated());
    }

    public void updateClassroom(String id, UpdateClassroomRequest request) {
        Classroom classroom = findClassroomByClassroomId(id);

        classroom.setDescription(request.getDescription());
        classroom.setTeacher(teacherService.findTeacherByTeacherId(request.getTeacherId()));

        classroomRepository.save(classroom);
        log.info(LogMessage.Classroom.ClassroomUpdated(id));
    }

    public void deleteClassroom(String id) {
        Classroom classroom = findClassroomByClassroomId(id);

        classroomRepository.delete(classroom);
        log.info(LogMessage.Classroom.ClassroomDeleted(id));
    }

    public ClassroomDto findClassroomById(String id) {
        Classroom classroom = findClassroomByClassroomId(id);

        log.info(LogMessage.Classroom.ClassroomFound(id));
        return converter.convert(classroom);
    }

    public List<ClassroomDto> findAllClassrooms() {
        List<Classroom> classroomList = classroomRepository.findAll();

        if (classroomList.isEmpty()) {
            log.error(LogMessage.Classroom.ClassroomListEmpty());
            throw new ClassroomNotFoundException(BusinessMessage.Classroom.CLASSROOM_LIST_EMPTY);
        }

        log.info(LogMessage.Classroom.ClassroomListed());
        return converter.convert(classroomList);
    }

    protected Classroom findClassroomByClassroomId(String id) {
        return classroomRepository.findById(id).orElseThrow(() -> {
            log.error(LogMessage.Classroom.ClassroomNotFound(id));
            throw new ClassroomNotFoundException(BusinessMessage.Classroom.CLASSROOM_NOT_FOUND);
        });
    }
}
