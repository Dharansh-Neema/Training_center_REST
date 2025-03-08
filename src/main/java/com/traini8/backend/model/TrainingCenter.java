package com.traini8.backend.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDateTime;
import java.util.ArrayList;

import lombok.Data;
@Document()
@Data
public class TrainingCenter {
    @Id
    private String id;

    @NotNull(message = "center name is required")
    @Size(message = "center name must be less tha 40 characters")
    private String centerName;

    @NotNull(message = "center code is required")
    @Size(min = 12,max = 12,message = "center code must be of 12 characters")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "center code must be alphanumeric")
    private String centerCode;

    @NotNull(message = "Address is required")
    private Address address;

    private Integer capacity;

    private ArrayList<String> coursesOffered;

    @Email(message = "Invalid email")
    private String email;

    @NotNull(message = "Phone number is required")
    @Size(min = 13, max = 13, message = "Phone number must be exactly 13 characters long.")
    @Pattern(regexp = "\\+\\d{12}", message = "Phone number must start with a '+' and have 12 digits following it.")
    private String phone;

    @CreatedDate
    private LocalDateTime createdOn;

    @LastModifiedDate
    private LocalDateTime updatedOn;

}
