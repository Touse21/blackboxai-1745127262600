package com.example.lmsbackend.service;

import com.example.lmsbackend.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    Course saveCourse(Course course);
    Optional<Course> getCourseById(Long id);
    List<Course> getAllCourses();
    void deleteCourse(Long id);
}
