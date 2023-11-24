package com.ProjectFinal.FINAL_PROJECT.controller;

import com.ProjectFinal.FINAL_PROJECT.model.Teacher;
import com.ProjectFinal.FINAL_PROJECT.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    public ResponseEntity<String> saveTeacher(@RequestBody Teacher teacher) {
        teacherService.saveTeacher(teacher);
        return new ResponseEntity<>("Teacher saved successfully", HttpStatus.CREATED);
    }

}
