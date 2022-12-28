package com.bms.schoolmanagementsystem.helper;

public class GenerateClassroomName {
    public static String generate() {
        final StringBuilder name = new StringBuilder("Cls-");
        for (int i = 0; i < 5; i++) {
            name.append((int) (Math.random() * 10));
        }
        return name.toString();
    }
}
