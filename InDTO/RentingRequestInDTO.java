package com.example.capstone3.InDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RentingRequestInDTO {
    private Integer renting_id;

    @Column(columnDefinition = "date not null")
    @FutureOrPresent(message = "Start date must be in the present or future")
    private LocalDate startDate;

    @Column(columnDefinition = "date not null")
    @Future(message = "End date must be in the future")
    private LocalDate endDate;
}
