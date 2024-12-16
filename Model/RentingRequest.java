package com.example.capstone3.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.websocket.server.ServerEndpoint;
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
public class RentingRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "date ")
    private LocalDate requestDate = LocalDate.now();

    @Column(columnDefinition = "date not null")
    @FutureOrPresent(message = "Start date must be in the present or future")
    private LocalDate startDate;

    @Column(columnDefinition = "date not null")
    @Future(message = "End date must be in the future")
    private LocalDate endDate;

    @Column(columnDefinition = "int")
    private Integer totalCost;

    //@OneToOne
    //@JsonIgnore
    //private Renting renting;

    @ManyToOne
    @JsonBackReference
    private User user;
}
