package com.falconx.Talon_Tech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Scholarship
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;
    private String gender;
    private String scholarshipAmount;
    private Integer annualIncome;
    private Double ssc;
    private Double hsc;
    private Double cgpa;
    private String category;
    private String link;
}
