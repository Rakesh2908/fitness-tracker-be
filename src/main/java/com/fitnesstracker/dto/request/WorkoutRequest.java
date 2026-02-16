package com.fitnesstracker.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutRequest {

    @NotNull(message = "Date is required")
    private LocalDate date;

    @NotBlank(message = "Exercise ID is required")
    @Size(max = 255)
    private String exerciseId;

    @NotNull(message = "Sets is required")
    @Positive
    private Integer sets;

    private Integer reps;

    @Size(max = 65535)
    private String notes;
}
