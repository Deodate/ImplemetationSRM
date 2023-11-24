package com.ProjectFinal.FINAL_PROJECT.service;

import com.ProjectFinal.FINAL_PROJECT.DTO.SemesterDTO;
import com.ProjectFinal.FINAL_PROJECT.model.Semester;
import com.ProjectFinal.FINAL_PROJECT.repository.SemesterRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemesterServiceImpl implements  SemesterService{
    private final SemesterRepository semesterRepository; // Assuming you have a repository

    @Autowired
    public SemesterServiceImpl(SemesterRepository semesterRepository) {
        this.semesterRepository = semesterRepository;
    }

    @Override
    public Semester saveSemester(Semester semester) {
        // Implement the logic to save the semester
        // You can use the repository to save the entity
        // For example:
        return semesterRepository.save(semester);
    }
}
