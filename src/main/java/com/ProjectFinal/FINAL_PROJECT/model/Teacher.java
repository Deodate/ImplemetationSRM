package com.ProjectFinal.FINAL_PROJECT.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @Column(name = "names", nullable = false)
    private String names;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "degree")
    private String degree;

    @Column(name = "course_definition_id")
    private Long courseDefinitionId;
}
