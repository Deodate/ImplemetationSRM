package com.ProjectFinal.FINAL_PROJECT.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "course")
public class Course {
    @Id
    @Column(name = "code", unique = true)
    private String code;

    @Column(name = "course_code", unique = true) // Add unique constraint
    private String courseCode;


    @Column(name = "name")
    private String name;

    private String departmentCode;
    private String semesterName;

    @Column(name = "qualification")
    private String qualification;

    @ManyToMany
    @JoinTable(
            name = "student_courses",
            joinColumns = @JoinColumn(name = "course_code"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private Set<Student> students = new HashSet<>();

}
