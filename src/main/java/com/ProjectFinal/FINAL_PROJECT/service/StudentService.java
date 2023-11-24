package com.ProjectFinal.FINAL_PROJECT.service;

import com.ProjectFinal.FINAL_PROJECT.DTO.StudentDTO;
import com.ProjectFinal.FINAL_PROJECT.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDTO studentDTO);
    void deleteStudent(String regNo);
    List<Student> getAllStudents();

    List<Student> getStudentsBySemester(String semesterName);
    List<Student> getStudentsByDepartmentAndSemester(String departmentCode, String semesterName);
    List<Student> getStudentsByCourseAndSemester(String courseCode, String semesterName);
    void updateFirstName(String regNo, String newFirstName);
    List<Student> getCoursesByStudentRegNo(String regNo);
}
