package com.fitnesstracker.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
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
public class NutritionLogRequest {

    @NotNull(message = "Date is required")
    private LocalDate date;

    @NotBlank(message = "Food query is required")
    @Size(max = 500)
    private String foodQuery;

    @NotNull(message = "Calories is required")
    @PositiveOrZero
    private Integer calories;

    @PositiveOrZero
    private Double proteinG;

    @PositiveOrZero
    private Double carbsG;
}
