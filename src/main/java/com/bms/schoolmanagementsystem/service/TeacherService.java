package com.bms.schoolmanagementsystem.service;

import com.bms.schoolmanagementsystem.dto.TeacherDto;
import com.bms.schoolmanagementsystem.dto.converter.TeacherDtoConverter;
import com.bms.schoolmanagementsystem.dto.request.teacher.CreateTeacherRequest;
import com.bms.schoolmanagementsystem.dto.request.teacher.UpdateTeacherRequest;
import com.bms.schoolmanagementsystem.exception.teacher.TeacherAlreadyExistException;
import com.bms.schoolmanagementsystem.exception.teacher.TeacherNotFoundException;
import com.bms.schoolmanagementsystem.helper.BusinessMessage;
import com.bms.schoolmanagementsystem.helper.DateHelper;
import com.bms.schoolmanagementsystem.helper.LogMessage;
import com.bms.schoolmanagementsystem.model.Teacher;
import com.bms.schoolmanagementsystem.repository.TeacherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TeacherService {
    private final TeacherRepository teacherRepository;
    private final TeacherDtoConverter converter;

    public TeacherService(TeacherRepository teacherRepository,
                          TeacherDtoConverter converter) {
        this.teacherRepository = teacherRepository;
        this.converter = converter;
    }

    public void createTeacher(CreateTeacherRequest request) {
        checkIfTeacherExists(request.getNationalId());

        Teacher teacher = new Teacher();
        teacher.setFirstName(request.getFirstName());
        teacher.setLastName(request.getLastName());
        teacher.setNationalId(request.getNationalId());
        teacher.setPhone(request.getPhone());
        teacher.setCreatedDate(DateHelper.getCurrentDate());
        teacher.setUpdatedDate(DateHelper.getCurrentDate());

        teacherRepository.save(teacher);
        log.info(LogMessage.Teacher.TeacherCreated());
    }

    public void updateTeacher(String id, UpdateTeacherRequest request) {
        Teacher teacher = findTeacherByTeacherId(id);

        teacher.setFirstName(request.getFirstName());
        teacher.setLastName(request.getLastName());
        teacher.setPhone(request.getPhone());
        teacher.setUpdatedDate(DateHelper.getCurrentDate());

        teacherRepository.save(teacher);
        log.info(LogMessage.Teacher.TeacherUpdated(id));
    }

    public void deleteTeacher(String id) {
        Teacher teacher = findTeacherByTeacherId(id);

        teacherRepository.delete(teacher);
        log.info(LogMessage.Teacher.TeacherDeleted(id));
    }

    public TeacherDto findTeacherById(String id) {
        Teacher teacher = findTeacherByTeacherId(id);

        log.info(LogMessage.Teacher.TeacherFound(id));
        return converter.convert(teacher);
    }

    public List<TeacherDto> findAllTeachers() {
        List<Teacher> teacherList = teacherRepository.findAll();

        if (teacherList.isEmpty()) {
            log.error(LogMessage.Teacher.TeacherListEmpty());
            throw new TeacherNotFoundException(BusinessMessage.Teacher.TEACHER_LIST_EMPTY);
        }

        log.info(LogMessage.Teacher.TeacherListed());
        return converter.convert(teacherList);
    }

    private void checkIfTeacherExists(String nationalId) {
        if (teacherRepository.existsByNationalId(nationalId)) {
            log.error(LogMessage.Teacher.TeacherAlreadyExists(nationalId));
            throw new TeacherAlreadyExistException(BusinessMessage.Teacher.TEACHER_ALREADY_EXISTS);
        }
    }

    protected Teacher findTeacherByTeacherId(String id) {
        return teacherRepository.findById(id).orElseThrow(() -> {
            log.error(LogMessage.Teacher.TeacherNotFound(id));
            return new TeacherNotFoundException(BusinessMessage.Teacher.TEACHER_NOT_FOUND);
        });
    }
}
