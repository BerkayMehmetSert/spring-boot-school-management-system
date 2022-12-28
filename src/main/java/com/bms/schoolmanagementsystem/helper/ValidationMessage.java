package com.bms.schoolmanagementsystem.helper;

public class ValidationMessage {
    public static class General {
        public static final String PHONE_REGEX = "^[09]{2}[0-9]{9}$";
        public static final String NATIONAL_ID_REGEX = "^[1-9]{1}[0-9]{10}$";
    }

    public static class Address {
        public static final String ADDRESS_STREET_NOT_EMPTY = "Address street can not be empty";
        public static final String ADDRESS_STREET_NOT_NULL = "Address street can not be null";
        public static final String ADDRESS_CITY_NOT_EMPTY = "Address city can not be empty";
        public static final String ADDRESS_CITY_NOT_NULL = "Address city can not be null";
        public static final String ADDRESS_STATE_NOT_EMPTY = "Address state can not be empty";
        public static final String ADDRESS_STATE_NOT_NULL = "Address state can not be null";
        public static final String ADDRESS_ZIPCODE_NOT_EMPTY = "Address zip code can not be empty";
        public static final String ADDRESS_ZIPCODE_NOT_NULL = "Address zip code can not be null";
        public static final String ADDRESS_STUDENT_ID_NOT_EMPTY = "Address student id can not be empty";
        public static final String ADDRESS_STUDENT_ID_NOT_NULL = "Address student id can not be null";

    }

    public static class Classroom {
        public static final String CLASSROOM_DESCRIPTION_NOT_EMPTY = "Classroom description can not be empty";
        public static final String CLASSROOM_DESCRIPTION_NOT_NULL = "Classroom description can not be null";
        public static final String CLASSROOM_TEACHER_ID_NOT_EMPTY = "Classroom teacher id can not be empty";
        public static final String CLASSROOM_TEACHER_ID_NOT_NULL = "Classroom teacher id can not be null";
    }

    public static class Student {
        public static final String STUDENT_FIRST_NAME_NOT_EMPTY = "Student first name can not be empty";
        public static final String STUDENT_FIRST_NAME_NOT_NULL = "Student first name can not be null";
        public static final String STUDENT_LAST_NAME_NOT_EMPTY = "Student last name can not be empty";
        public static final String STUDENT_LAST_NAME_NOT_NULL = "Student last name can not be null";
        public static final String STUDENT_NATIONAL_ID_NOT_EMPTY = "Student national id can not be empty";
        public static final String STUDENT_NATIONAL_ID_NOT_NULL = "Student national id can not be null";
        public static final String STUDENT_NATIONAL_ID_NOT_VALID = "Student national id is not valid, it should be 11 digits";
        public static final String STUDENT_FATHER_NAME_NOT_EMPTY = "Student father name can not be empty";
        public static final String STUDENT_FATHER_NAME_NOT_NULL = "Student father name can not be null";
        public static final String STUDENT_FATHER_PHONE_NOT_EMPTY = "Student father phone can not be empty";
        public static final String STUDENT_FATHER_PHONE_NOT_NULL = "Student father phone can not be null";
        public static final String STUDENT_FATHER_PHONE_NOT_VALID = "Student father phone is not valid";
        public static final String STUDENT_MOTHER_NAME_NOT_EMPTY = "Student mother name can not be empty";
        public static final String STUDENT_MOTHER_NAME_NOT_NULL = "Student mother name can not be null";
        public static final String STUDENT_MOTHER_PHONE_NOT_EMPTY = "Student mother phone can not be empty";
        public static final String STUDENT_MOTHER_PHONE_NOT_NULL = "Student mother phone can not be null";
        public static final String STUDENT_MOTHER_PHONE_NOT_VALID = "Student mother phone is not valid";
        public static final String STUDENT_CLASSROOM_ID_NOT_EMPTY = "Student classroom id can not be empty";
    }

    public static class Teacher {
        public static final String TEACHER_FIRST_NAME_NOT_EMPTY = "Teacher first name can not be empty";
        public static final String TEACHER_FIRST_NAME_NOT_NULL = "Teacher first name can not be null";
        public static final String TEACHER_LAST_NAME_NOT_EMPTY = "Teacher last name can not be empty";
        public static final String TEACHER_LAST_NAME_NOT_NULL = "Teacher last name can not be null";
        public static final String TEACHER_NATIONAL_ID_NOT_EMPTY = "Teacher national id can not be empty";
        public static final String TEACHER_NATIONAL_ID_NOT_NULL = "Teacher national id can not be null";
        public static final String TEACHER_NATIONAL_ID_NOT_VALID = "Teacher national id is not valid, it should be 11 digits";
        public static final String TEACHER_PHONE_NOT_EMPTY = "Teacher phone can not be empty";
        public static final String TEACHER_PHONE_NOT_NULL = "Teacher phone can not be null";
        public static final String TEACHER_PHONE_NOT_VALID = "Teacher phone is not valid";
    }
}
