package com.redeemerlives.studentsservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class StudentsExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handleException(MethodArgumentNotValidException exception) {

        var errors = new HashMap<String, Object>();
        exception.getBindingResult().getFieldErrors()
                .forEach(error -> {
                    var errorName = error.getField();
                    var errorValue = error.getDefaultMessage();
                    errors.put(errorName, errorValue);
                });

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    }

}
