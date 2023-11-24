package com.ProjectFinal.FINAL_PROJECT.service;

import com.ProjectFinal.FINAL_PROJECT.DTO.TeacherDTO;
import com.ProjectFinal.FINAL_PROJECT.model.Teacher;
import com.ProjectFinal.FINAL_PROJECT.repository.TeacherRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherServic{

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public void saveTeacher(TeacherDTO teacherDTO) {
        Teacher teacher = new Teacher();
        BeanUtils.copyProperties(teacherDTO, teacher);
        // Additional logic for saving teacher...
        teacherRepository.save(teacher);
    }
}
