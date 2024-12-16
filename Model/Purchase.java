package com.example.capstone3.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;



    @Column(columnDefinition = "int not null")
    @Positive(message = "Price must be positive")
    private Integer price;

    @Column(columnDefinition = "date")
    private LocalDate purchaseDate = LocalDate.now();

    @ManyToOne
    @JsonIgnore
    private User user;

    //@OneToOne
    //@JsonIgnore
    //private Motorcycle
}
