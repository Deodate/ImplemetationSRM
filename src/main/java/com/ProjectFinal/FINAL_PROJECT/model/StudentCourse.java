package com.ProjectFinal.FINAL_PROJECT.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "student_course")
public class StudentCourse {
    @Id
    private Integer credits;
    private BigDecimal results;
}
