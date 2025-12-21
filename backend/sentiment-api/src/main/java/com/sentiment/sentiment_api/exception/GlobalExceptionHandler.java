package com.sentiment.sentiment_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        // Simplify error message for the user as requested: "error": "..."
        // Taking the first error message or a combined one
        String errorMessage = ex.getBindingResult().getAllErrors().get(0).getDefaultMessage();
        
        errors.put("error", errorMessage);
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
