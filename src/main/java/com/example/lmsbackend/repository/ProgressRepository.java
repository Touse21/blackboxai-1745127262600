package com.example.lmsbackend.repository;

import com.example.lmsbackend.model.Progress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgressRepository extends JpaRepository<Progress, Long> {
}
