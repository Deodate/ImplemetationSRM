package com.ProjectFinal.FINAL_PROJECT.repository;

import com.ProjectFinal.FINAL_PROJECT.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByDepartmentCodeAndSemesterName(String departmentCode, String semesterName);


}
