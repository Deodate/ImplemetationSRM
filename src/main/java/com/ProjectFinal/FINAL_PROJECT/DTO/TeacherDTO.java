package com.ProjectFinal.FINAL_PROJECT.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherDTO {

    private String code;
    private String names;
    private String qualification;
    private String degree;
    private Long courseDefinitionId;

    // Constructors, getters, setters...

    public TeacherDTO(String code, String names, String qualification, String degree, Long courseDefinitionId) {
        this.code = code;
        this.names = names;
        this.qualification = qualification;
        this.degree = degree;
        this.courseDefinitionId = courseDefinitionId;
    }
}
