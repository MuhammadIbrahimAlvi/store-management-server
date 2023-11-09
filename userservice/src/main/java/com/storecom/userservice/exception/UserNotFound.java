package com.storecom.userservice.exception;

import com.storecom.userservice.util.DataValidationMessage;

public class UserNotFound extends RuntimeException{
    public UserNotFound(Long id) {
        super(String.format(DataValidationMessage.USER_NOT_FOUND + "%d", id));
    }
}
