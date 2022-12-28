package com.bms.schoolmanagementsystem.helper;

public class GenerateStudentNumber {
    public static String generate() {
        final StringBuilder studentNumber = new StringBuilder("STU");
        for (int i = 0; i < 6; i++) {
            studentNumber.append((int) (Math.random() * 10));
        }
        return studentNumber.toString();
    }
}
