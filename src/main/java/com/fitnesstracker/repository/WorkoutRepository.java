package com.fitnesstracker.repository;

import com.fitnesstracker.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {

    List<Workout> findByUserId(Long userId);

    List<Workout> findByUserIdAndDateBetween(Long userId, LocalDate start, LocalDate end);
}
