package com.ProjectFinal.FINAL_PROJECT.controller;

import com.ProjectFinal.FINAL_PROJECT.DTO.SemesterDTO;
import com.ProjectFinal.FINAL_PROJECT.model.Semester;
import com.ProjectFinal.FINAL_PROJECT.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/semesters")
public class SemesterController {
    private final SemesterService semesterService;

    @Autowired
    public SemesterController(SemesterService semesterService) {
        this.semesterService = semesterService;
    }

    @PostMapping
    public ResponseEntity<Semester> saveSemester(@RequestBody SemesterDTO semesterDTO) {
        Semester semester = convertDtoToEntity(semesterDTO);
        semester.setStartDate(semesterDTO.getStartDate());
        semester.setEndDate(semesterDTO.getEndDate());
        Semester savedSemester = semesterService.saveSemester(semester);
        return new ResponseEntity<>(savedSemester, HttpStatus.CREATED);
    }

    private Semester convertDtoToEntity(SemesterDTO semesterDTO) {
        Semester semester = new Semester();
        // Set properties based on the SemesterDTO
        semester.setName(semesterDTO.getName());
        semester.setSemesterName(semesterDTO.getSemesterName());
        // Set other properties as needed
        return semester;
    }
}
