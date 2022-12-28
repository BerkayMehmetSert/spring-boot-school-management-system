package com.bms.schoolmanagementsystem.exception.teacher;

public class TeacherAlreadyExistException extends RuntimeException {
    public TeacherAlreadyExistException(String message) {
        super(message);
    }
}
