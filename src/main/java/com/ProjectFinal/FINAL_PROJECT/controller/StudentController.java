package com.ProjectFinal.FINAL_PROJECT.controller;

import com.ProjectFinal.FINAL_PROJECT.DTO.StudentDTO;
import com.ProjectFinal.FINAL_PROJECT.model.Student;
import com.ProjectFinal.FINAL_PROJECT.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    private final StudentService studentService;


    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/{regNo}/updateFirstName", method = {RequestMethod.POST, RequestMethod.PATCH})
    public ResponseEntity<String> updateFirstName(@PathVariable String regNo, @RequestBody Map<String, String> requestBody) {
        String newFirstName = requestBody.get("newFirstName");
        studentService.updateFirstName(regNo, newFirstName);
        return new ResponseEntity<>("First name updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/{regNo}")
    public ResponseEntity<String> deleteStudent(@PathVariable String regNo) {
        studentService.deleteStudent(regNo);
        return new ResponseEntity<>("Student deleted successfully", HttpStatus.OK);
    }
    @GetMapping("/department-semester")
    public List<Student> getStudentsByDepartmentAndSemester(
            @RequestParam(name = "departmentCode") String departmentCode,
            @RequestParam(name = "semesterName") String semesterName) {
        return studentService.getStudentsByDepartmentAndSemester(departmentCode, semesterName);
    }

    @PostMapping
    public ResponseEntity<String> saveStudent(@RequestBody StudentDTO studentDTO) {
        studentService.saveStudent(studentDTO);
        return new ResponseEntity<>("Student saved successfully", HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<?> getAllStudents() {
        try {
            List<Student> students = studentService.getAllStudents();
            return new ResponseEntity<>(students, HttpStatus.OK);
        } catch (Exception e) {
            // Log the exception
            logger.error("Error while retrieving students", e);

            // Return a custom error response
            return new ResponseEntity<>("Error retrieving students", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/courses/{regNo}")
    public ResponseEntity<List<Student>> getCoursesByStudentRegNo(@PathVariable String regNo) {
        List<Student> courses = studentService.getCoursesByStudentRegNo(regNo);
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @GetMapping("/semester")
    public List<Student> getStudentsBySemester(@RequestParam(name = "semesterName") String semesterName) {
        return studentService.getStudentsBySemester(semesterName);
    }
    @GetMapping("/course-semester")
    public List<Student> getStudentsByCourseAndSemester(
            @RequestParam String courseCode,
            @RequestParam String semesterName) {
        return studentService.getStudentsByCourseAndSemester(courseCode, semesterName);
    }
}
