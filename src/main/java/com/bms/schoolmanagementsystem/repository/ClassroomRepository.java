package com.bms.schoolmanagementsystem.repository;

import com.bms.schoolmanagementsystem.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, String> {
}