package com.fitnesstracker.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NutritionLogResponse {

    private Long id;
    private LocalDate date;
    private String foodQuery;
    private Integer calories;
    private Double proteinG;
    private Double carbsG;
    private Instant createdAt;
}
