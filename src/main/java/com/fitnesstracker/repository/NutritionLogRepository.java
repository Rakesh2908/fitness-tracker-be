package com.fitnesstracker.repository;

import com.fitnesstracker.entity.NutritionLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface NutritionLogRepository extends JpaRepository<NutritionLog, Long> {

    List<NutritionLog> findByUserId(Long userId);

    List<NutritionLog> findByUserIdAndDateBetween(Long userId, LocalDate start, LocalDate end);
}
