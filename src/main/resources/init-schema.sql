CREATE TABLE address
(
    id         VARCHAR(255) NOT NULL,
    street     VARCHAR(255),
    city       VARCHAR(255),
    state      VARCHAR(255),
    zip_code   VARCHAR(255),
    student_id VARCHAR(255),
    CONSTRAINT pk_address PRIMARY KEY (id)
);

CREATE TABLE classroom
(
    id          VARCHAR(255) NOT NULL,
    name        VARCHAR(255),
    description VARCHAR(255),
    teacher_id  VARCHAR(255),
    CONSTRAINT pk_classroom PRIMARY KEY (id)
);

CREATE TABLE student
(
    id             VARCHAR(255) NOT NULL,
    first_name     VARCHAR(255),
    last_name      VARCHAR(255),
    national_id    VARCHAR(255),
    created_date   TIMESTAMP WITHOUT TIME ZONE,
    updated_date   TIMESTAMP WITHOUT TIME ZONE,
    father_name    VARCHAR(255),
    father_phone   VARCHAR(255),
    mother_name    VARCHAR(255),
    mother_phone   VARCHAR(255),
    student_number VARCHAR(255),
    classroom_id   VARCHAR(255),
    CONSTRAINT pk_student PRIMARY KEY (id)
);

CREATE TABLE teacher
(
    id           VARCHAR(255) NOT NULL,
    first_name   VARCHAR(255),
    last_name    VARCHAR(255),
    national_id  VARCHAR(255),
    created_date TIMESTAMP WITHOUT TIME ZONE,
    updated_date TIMESTAMP WITHOUT TIME ZONE,
    phone        VARCHAR(255),
    CONSTRAINT pk_teacher PRIMARY KEY (id)
);

ALTER TABLE address
    ADD CONSTRAINT FK_ADDRESS_ON_STUDENT_ID FOREIGN KEY (student_id) REFERENCES student (id);

ALTER TABLE classroom
    ADD CONSTRAINT FK_CLASSROOM_ON_TEACHER_ID FOREIGN KEY (teacher_id) REFERENCES teacher (id);

ALTER TABLE student
    ADD CONSTRAINT FK_STUDENT_ON_CLASSROOM_ID FOREIGN KEY (classroom_id) REFERENCES classroom (id);