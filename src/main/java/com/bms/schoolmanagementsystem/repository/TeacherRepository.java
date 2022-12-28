package com.bms.schoolmanagementsystem.repository;

import com.bms.schoolmanagementsystem.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, String> {
    boolean existsByNationalId(Object unknownAttr1);
}