package com.fitnesstracker.repository;

import com.fitnesstracker.entity.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface HabitRepository extends JpaRepository<Habit, Long> {

    List<Habit> findByUserId(Long userId);

    List<Habit> findByUserIdAndDateBetween(Long userId, LocalDate start, LocalDate end);
}
