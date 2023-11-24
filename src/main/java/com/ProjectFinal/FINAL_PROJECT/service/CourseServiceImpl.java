package com.ProjectFinal.FINAL_PROJECT.service;

import com.ProjectFinal.FINAL_PROJECT.DTO.CourseDTO;
import com.ProjectFinal.FINAL_PROJECT.model.Course;
import com.ProjectFinal.FINAL_PROJECT.model.Student;
import com.ProjectFinal.FINAL_PROJECT.repository.CourseRepository;
import com.ProjectFinal.FINAL_PROJECT.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Course registerCourse(CourseDTO courseDTO) {
        // Your logic to generate a unique code
        String generatedCode = generateCode();

        // Create a new Course entity
        Course newCourse = new Course();
        newCourse.setCourseCode(courseDTO.getCourseCode());
        newCourse.setCode(generatedCode);
        newCourse.setName(courseDTO.getName());
        newCourse.setQualification(courseDTO.getQualification());


        // Save the entity in the database
        return courseRepository.save(newCourse);
    }

    private String generateCode() {
        // Your code generation logic goes here
        // For example, you can use UUID.randomUUID().toString() for simplicity
        return UUID.randomUUID().toString();
    }

    @Override
    public List<Student> getStudentsByCourseAndSemester(String courseCode, String semester) {
        // Implement the logic to retrieve students by courseCode and semester
        return studentRepository.findByCourseCodeAndSemester(courseCode, semester);
    }

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
}
