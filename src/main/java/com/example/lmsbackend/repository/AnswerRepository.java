package com.example.lmsbackend.repository;

import com.example.lmsbackend.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
