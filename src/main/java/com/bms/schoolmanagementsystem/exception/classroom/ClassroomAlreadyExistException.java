package com.bms.schoolmanagementsystem.exception.classroom;

public class ClassroomAlreadyExistException extends RuntimeException {
    public ClassroomAlreadyExistException(String message) {
        super(message);
    }
}
