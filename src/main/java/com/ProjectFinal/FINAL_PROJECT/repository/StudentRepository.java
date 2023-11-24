package com.ProjectFinal.FINAL_PROJECT.repository;

import com.ProjectFinal.FINAL_PROJECT.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String> {


    @Query("SELECT s FROM Student s " +
            "LEFT OUTER JOIN s.courses c " +
            "WHERE c.courseCode = :courseCode AND s.semesterName = :semesterName")
    List<Student> findByCourseCodeAndSemester(@Param("courseCode") String courseCode,
                                              @Param("semesterName") String semesterName);

    List<Student> findByRegNo(String regNo);
    List<Student> findBySemesterName(String semesterName);

    List<Student> findByDepartmentCodeAndSemesterName(String departmentCode, String semesterName);

    List<Student> findByCourses_CourseCodeAndSemesterName(String courseCode, String semesterName);

    List<Student> findByCourses_CodeAndSemesterName(String courseCode, String semesterName);

}
