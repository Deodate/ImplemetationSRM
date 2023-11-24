package com.ProjectFinal.FINAL_PROJECT.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "student_registration")
public class StudentRegistration {
    @Id
    private String studentId;
    private LocalDate registrationDate;

}
