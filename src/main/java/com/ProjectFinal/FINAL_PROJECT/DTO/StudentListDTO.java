package com.ProjectFinal.FINAL_PROJECT.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Date;

@Getter
@Setter
public class StudentListDTO {
    private String regNo;
    private String firstName;
    private Date dateOfBirth;
    private Instant creationTimestamp;
    // Constructors, getters, and setters...

    public StudentListDTO(String regNo, String firstName, Date dateOfBirth, Instant creationTimestamp) {
        this.regNo = regNo;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.creationTimestamp = creationTimestamp;
    }
}
