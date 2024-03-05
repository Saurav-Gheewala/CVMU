package com.falconx.Talon_Tech.model;
import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
public class FirstPage
{
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dob;
    private String gender;
    private String email;
    private String phone;
    private String category;
    private String caste;
    private String religion;
    private String motherName;
    private String fatherName;
    private String parentOccupation;
    private Integer annualIncome;
    private String studentType;
    private String hostelType;
    private String habitationType;
    private Boolean isOrphan;
}
