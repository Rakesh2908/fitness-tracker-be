package com.fitnesstracker.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HabitRequest {

    @NotNull(message = "Date is required")
    private LocalDate date;

    @PositiveOrZero
    private Double sleepHours;

    @PositiveOrZero
    private Integer steps;
}
