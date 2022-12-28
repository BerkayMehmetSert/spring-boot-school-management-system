package com.bms.schoolmanagementsystem.controller;

import com.bms.schoolmanagementsystem.dto.ClassroomDto;
import com.bms.schoolmanagementsystem.dto.request.classroom.CreateClassroomRequest;
import com.bms.schoolmanagementsystem.dto.request.classroom.UpdateClassroomRequest;
import com.bms.schoolmanagementsystem.service.ClassroomService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/classrooms")
@Tag(name = "Classroom", description = "Classroom API")
public class ClassroomController {
    private final ClassroomService classroomService;

    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @Operation(summary = "Create a classroom",
            description = "Create a classroom",
            tags = {"Classroom"})
    @PostMapping
    public ResponseEntity<Void> createClassroom(@Valid CreateClassroomRequest request) {
        classroomService.createClassroom(request);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update a classroom",
            description = "Update a classroom by id",
            tags = {"Classroom"})
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateClassroom(@PathVariable String id,
                                                @Valid UpdateClassroomRequest request) {
        classroomService.updateClassroom(id, request);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Delete a classroom",
            description = "Delete a classroom by id",
            tags = {"Classroom"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClassroom(@PathVariable String id) {
        classroomService.deleteClassroom(id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get a classroom",
            description = "Get a classroom by id",
            tags = {"Classroom"})
    @GetMapping("/{id}")
    public ResponseEntity<ClassroomDto> findClassroomById(@PathVariable String id) {
        return ResponseEntity.ok(classroomService.findClassroomById(id));
    }

    @Operation(summary = "Get all classrooms",
            description = "Get all classrooms",
            tags = {"Classroom"})
    @GetMapping
    public ResponseEntity<List<ClassroomDto>> findAllClassrooms() {
        return ResponseEntity.ok(classroomService.findAllClassrooms());
    }
}
