package com.bms.schoolmanagementsystem.repository;

import com.bms.schoolmanagementsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
    boolean existsByMotherPhone(String motherPhone);
    boolean existsByFatherPhone(String fatherPhone);
    boolean existsByNationalId(String nationalId);
}