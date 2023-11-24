package com.ProjectFinal.FINAL_PROJECT.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class SemesterDTO {
    private Long id;
    private LocalDate endDate; // Change the data type to LocalDate
    private LocalDate startDate; // Change the data type to LocalDate
    private String name;
    private String semesterName;
}
