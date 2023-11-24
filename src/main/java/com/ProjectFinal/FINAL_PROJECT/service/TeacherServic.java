package com.ProjectFinal.FINAL_PROJECT.service;

import com.ProjectFinal.FINAL_PROJECT.DTO.TeacherDTO;
import com.ProjectFinal.FINAL_PROJECT.model.Teacher;

import java.util.List;

public interface TeacherServic {
    List<Teacher> getAllTeachers();
    void saveTeacher(TeacherDTO teacherDTO);
}
