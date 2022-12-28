package com.bms.schoolmanagementsystem.helper;

public class LogMessage {
    public static class Address {
        public static String AddressNotFound(String value) {
            return "Address with " + value + " not found";
        }

        public static String AddressAlreadyExists(String value) {
            return "Address with " + value + " already exists";
        }

        public static String AddressCreated() {
            return "Address created successfully";
        }

        public static String AddressUpdated(String value) {
            return "Address with " + value + " updated successfully";
        }

        public static String AddressDeleted(String value) {
            return "Address with " + value + " deleted successfully";
        }

        public static String AddressListed() {
            return "Address listed successfully";
        }

        public static String AddressFound(String value) {
            return "Address with " + value + " found successfully";
        }

        public static String AddressListEmpty() {
            return "Address list is empty";
        }
    }

    public static class Classroom {
        public static String ClassroomNotFound(String value) {
            return "Classroom with " + value + " not found";
        }

        public static String ClassroomAlreadyExists(String value) {
            return "Classroom with " + value + " already exists";
        }

        public static String ClassroomCreated() {
            return "Classroom created successfully";
        }

        public static String ClassroomUpdated(String value) {
            return "Classroom with " + value + " updated successfully";
        }

        public static String ClassroomDeleted(String value) {
            return "Classroom with " + value + " deleted successfully";
        }

        public static String ClassroomListed() {
            return "Classroom listed successfully";
        }

        public static String ClassroomFound(String value) {
            return "Classroom with " + value + " found successfully";
        }

        public static String ClassroomListEmpty() {
            return "Classroom list is empty";
        }
    }

    public static class Student {
        public static String StudentNotFound(String value) {
            return "Student with " + value + " not found";
        }

        public static String StudentAlreadyExists(String value) {
            return "Student with " + value + " already exists";
        }

        public static String StudentCreated() {
            return "Student created successfully";
        }

        public static String StudentUpdated(String value) {
            return "Student with " + value + " updated successfully";
        }

        public static String StudentDeleted(String value) {
            return "Student with " + value + " deleted successfully";
        }

        public static String StudentListed() {
            return "Student listed successfully";
        }

        public static String StudentFound(String value) {
            return "Student with " + value + " found successfully";
        }

        public static String StudentListEmpty() {
            return "Student list is empty";
        }

        public static String FatherPhoneAlreadyExists(String value) {
            return "Student father phone with " + value + " already exists";
        }

        public static String MotherPhoneAlreadyExists(String value) {
            return "Student mother phone with " + value + " already exists";
        }

        public static String StudentAddedToClassroom(String value, String classroomId) {
            return "Student with " + value + " added to classroom with " + classroomId + " successfully";
        }

        public static String StudentRemovedFromClassroom(String value) {
            return "Student with " + value + " removed from classroom successfully";
        }
    }

    public static class Teacher {
        public static String TeacherNotFound(String value) {
            return "Teacher with " + value + " not found";
        }

        public static String TeacherAlreadyExists(String value) {
            return "Teacher with " + value + " already exists";
        }

        public static String TeacherCreated() {
            return "Teacher created successfully";
        }

        public static String TeacherUpdated(String value) {
            return "Teacher with " + value + " updated successfully";
        }

        public static String TeacherDeleted(String value) {
            return "Teacher with " + value + " deleted successfully";
        }

        public static String TeacherListed() {
            return "Teacher listed successfully";
        }

        public static String TeacherFound(String value) {
            return "Teacher with " + value + " found successfully";
        }

        public static String TeacherListEmpty() {
            return "Teacher list is empty";
        }
    }
}
