package com.storecom.userservice.exception;

import com.storecom.userservice.util.DataValidationMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(UserNotFound.class)
    public ResponseEntity<Object> handleCityNotFoundException(
            UserNotFound ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", DataValidationMessage.USER_NOT_FOUND);
        body.put("status", 404);

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
}
