package com.ProjectFinal.FINAL_PROJECT.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "coursedefinition")
public class CourseDefinition {
    @Id
    private String code;
    private String name;
    private String description;
}
