package com.ProjectFinal.FINAL_PROJECT.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class StudentDTO {
    private String regNo;
    private String firstName;
    private String dateOfBirth;
    private String courseCode;
    private String semesterName;
    private String departmentCode;
    private LocalDate startDate;
    private LocalDate endDate;
}
