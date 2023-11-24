package com.ProjectFinal.FINAL_PROJECT.service;

import com.ProjectFinal.FINAL_PROJECT.model.Teacher;
import com.ProjectFinal.FINAL_PROJECT.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void saveTeacher(Teacher teacher) {
        // Add any business logic or validation here
        teacherRepository.save(teacher);
    }
}
