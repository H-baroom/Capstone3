package com.example.capstone3.InDTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PurchaseInDTO {
    private Integer motorcycle_id;

    @Column(columnDefinition = "date")
    private LocalDate purchaseDate = LocalDate.now();

}
