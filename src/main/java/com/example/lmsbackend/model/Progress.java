package com.example.lmsbackend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "progress")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "enrollment_id", nullable = false)
    private Enrollment enrollment;

    @Column(nullable = false)
    private int completedLessons;

    @Column(nullable = false)
    private int totalLessons;
}
