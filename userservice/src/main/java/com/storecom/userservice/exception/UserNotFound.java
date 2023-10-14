package com.storecom.userservice.exception;

public class UserNotFound extends RuntimeException{
    public UserNotFound(Long id) {
        super(String.format("User with Id %d not found", id));
    }
}
