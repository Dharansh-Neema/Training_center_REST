package com.traini8.backend.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
@Data
public class Address {
    @NotNull(message = "detailed address is required")
    public String detailedAddress;
    @NotNull(message = "city name is required")
    public String city;
    @NotNull(message = "state name is required")
    public String state;
    @NotNull(message = "pincode is required")
    public String pincode;
}
