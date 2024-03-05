package com.falconx.Talon_Tech.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class ScholarShipWrapper {
    private Integer id;
    private String name;
    private String type;
    private String scholarshipAmount;
    private String link;

    public ScholarShipWrapper(Integer id, String name, String type, String scholarshipAmount, String link) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.scholarshipAmount = scholarshipAmount;
        this.link = link;
    }
}
