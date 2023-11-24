package com.ProjectFinal.FINAL_PROJECT.service;

import com.ProjectFinal.FINAL_PROJECT.DTO.CourseDTO;
import com.ProjectFinal.FINAL_PROJECT.model.Course;
import com.ProjectFinal.FINAL_PROJECT.model.Student;

import java.util.List;

public interface CourseService {
    Course registerCourse(CourseDTO courseDTO);

    List<Student> getStudentsByCourseAndSemester(String courseCode, String semester);


}
