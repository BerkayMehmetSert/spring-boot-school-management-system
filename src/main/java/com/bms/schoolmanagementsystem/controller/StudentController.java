package com.bms.schoolmanagementsystem.controller;

import com.bms.schoolmanagementsystem.dto.StudentDto;
import com.bms.schoolmanagementsystem.dto.request.student.CreateStudentRequest;
import com.bms.schoolmanagementsystem.dto.request.student.UpdateStudentRequest;
import com.bms.schoolmanagementsystem.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@Tag(name = "Student", description = "Student API")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Operation(summary = "Create Student",
            description = "Create Student",
            tags = {"Student"})
    @PostMapping
    public ResponseEntity<Void> createStudent(@Valid CreateStudentRequest request) {
        studentService.createStudent(request);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update Student",
            description = "Update Student by id",
            tags = {"Student"})
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateStudent(@PathVariable String id,
                                              @Valid UpdateStudentRequest request) {
        studentService.updateStudent(id, request);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Add Student to Classroom",
            description = "Add Student to Classroom by student id and classroom id",
            tags = {"Student"})
    @PutMapping("/{id}/classroom/{classroomId}")
    public ResponseEntity<Void> addStudentToClassroom(@PathVariable String id, @PathVariable String classroomId) {
        studentService.addStudentToClassroom(id, classroomId);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Remove Student from Classroom",
            description = "Remove Student from Classroom by student id",
            tags = {"Student"})
    @PutMapping("/{id}/classroom/remove")
    public ResponseEntity<Void> removeStudentFromClassroom(@PathVariable String id) {
        studentService.removeStudentFromClassroom(id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Delete Student",
            description = "Delete Student by id",
            tags = {"Student"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get Student",
            description = "Get Student by id",
            tags = {"Student"})
    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudent(@PathVariable String id) {
        return ResponseEntity.ok(studentService.findStudentById(id));
    }

    @Operation(summary = "Get All Students",
            description = "Get All Students",
            tags = {"Student"})
    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        return ResponseEntity.ok(studentService.findAllStudents());
    }
}
