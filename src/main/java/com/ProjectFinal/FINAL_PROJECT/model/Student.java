package com.ProjectFinal.FINAL_PROJECT.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "student")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {
    @Id
    private String regNo;
    private String firstName;
    private String dateOfBirth;

    private String courseCode;
    private String semesterName;
    private String departmentCode;


    private LocalDate startDate;
    private LocalDate endDate;
    private String semester;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date creationTimestamp;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updateTimestamp;

    public LocalDateTime getCreationTimestamp() {
        // Convert java.util.Date to LocalDateTime
        return creationTimestamp.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDateTime();
    }
    public LocalDateTime getUpdateTimestamp() {
        // Convert java.util.Date to LocalDateTime
        return updateTimestamp.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDateTime();
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @ManyToMany(mappedBy = "students")
    private Set<Course> courses = new HashSet<>();



}
