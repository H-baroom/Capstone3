package com.example.capstone3.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(35) not null")
    @NotEmpty(message = "Name not valid")
    @Size(max = 35, message = "Name must not exceed 35 characters")
    private String name;

    @Column(columnDefinition = "varchar(40) not null unique")
    @NotEmpty(message = "Email not valid")
    @Email(message = "Invalid email format")
    private String email;

    @Column(columnDefinition = "varchar(10) not null unique")
    @NotEmpty(message = "Phone number not valid")
    @Pattern(regexp = "^05\\d{8}$", message = "Phone number must start with 05 and be 10 digits")
    private String phoneNumber;

    @Column(columnDefinition = "int not null")
    @Positive(message = "Age must be positive")
    @Min(value = 18, message = "You must be at least 18 years old to register")
    private Integer age;

    @Column(columnDefinition = "varchar(255)")
    @Size(max = 255, message = "Address length must not exceed 255 characters")
    private String address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<EventRegestration> eventRegestrations;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Purchase> purchases;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<RentingRequest> rentingRequests;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<BookingCourse> bookingCourses;



}
