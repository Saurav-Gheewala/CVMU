package com.falconx.Talon_Tech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dob;
    private String gender;
    private String email;
    private String phone;
    private String motherName;
    private String fatherName;
    private String category;
    private String religion;
    private String parentOccupation;
    private Integer annualIncome;
    private String studentType;
    private String hostelType;
    private String habitationType;
    private String isOrphan;
    private String courseDomain;
    private String courseYear;
    private Double sscMarks;
    private Double hscMarks;
    private Double cgpa;
}
