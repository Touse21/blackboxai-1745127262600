package com.example.lmsbackend.service;

import com.example.lmsbackend.model.Enrollment;

import java.util.List;
import java.util.Optional;

public interface EnrollmentService {
    Enrollment saveEnrollment(Enrollment enrollment);
    Optional<Enrollment> getEnrollmentById(Long id);
    List<Enrollment> getAllEnrollments();
    void deleteEnrollment(Long id);
}
