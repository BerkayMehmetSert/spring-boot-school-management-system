package com.bms.schoolmanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student{
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String firstName;
    private String lastName;
    private String nationalId;
    private Date createdDate;
    private Date updatedDate;
    private String fatherName;
    private String fatherPhone;
    private String motherName;
    private String motherPhone;
    private String studentNumber;
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Address> addressList;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classroom_id", referencedColumnName = "id")
    private Classroom classroom;
}
