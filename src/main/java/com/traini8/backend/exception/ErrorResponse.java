package com.traini8.backend.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorResponse {
    private Integer statusCode;
    private String message;
    private List<String> details;
}
