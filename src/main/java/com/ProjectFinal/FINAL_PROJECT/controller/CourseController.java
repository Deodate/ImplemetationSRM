package com.ProjectFinal.FINAL_PROJECT.controller;

import com.ProjectFinal.FINAL_PROJECT.DTO.CourseDTO;
import com.ProjectFinal.FINAL_PROJECT.model.Course;
import com.ProjectFinal.FINAL_PROJECT.model.Student;
import com.ProjectFinal.FINAL_PROJECT.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;


    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    @GetMapping("/{courseCode}/students")
    public ResponseEntity<List<Student>> getStudentsByCourseAndSemester(
            @PathVariable String courseCode,
            @RequestParam String semester
    ) {
        List<Student> students = courseService.getStudentsByCourseAndSemester(courseCode, semester);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerCourse(@RequestBody CourseDTO courseDTO) {
        try {
            Course registeredCourse = courseService.registerCourse(courseDTO);
            return new ResponseEntity<>(registeredCourse, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            // Handle the case where the course registration fails
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } }
}
