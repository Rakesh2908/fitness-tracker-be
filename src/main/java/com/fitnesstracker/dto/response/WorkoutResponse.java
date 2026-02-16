package com.fitnesstracker.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutResponse {

    private Long id;
    private LocalDate date;
    private String exerciseId;
    private Integer sets;
    private Integer reps;
    private String notes;
}
