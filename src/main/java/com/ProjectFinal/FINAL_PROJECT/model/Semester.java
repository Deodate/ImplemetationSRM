package com.ProjectFinal.FINAL_PROJECT.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "semester")
public class Semester {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate endDate; // Change the data type to LocalDate
    private LocalDate startDate; // Change the data type to LocalDate
    private String name;
    private String semesterName;
}
