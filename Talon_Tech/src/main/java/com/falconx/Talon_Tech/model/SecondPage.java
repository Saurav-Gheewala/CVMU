package com.falconx.Talon_Tech.model;

import lombok.*;

@Data
@NoArgsConstructor
@Setter
@Getter
@ToString
public class SecondPage {
    private String courseDomain;
    private String courseType;
    private String courseDepartment;
    private String courseYear;
    private String postGraduation;
    private Double sscMarks;
    private Double hscMarks;
    private Double CGPA;
}
