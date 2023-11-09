package com.storecom.userservice.service;

import com.storecom.userservice.dto.UserRequestDto;
import com.storecom.userservice.dto.UserResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<List<UserResponseDto>> getAllUsers();

    ResponseEntity<UserResponseDto> getUserById(Long id);

    ResponseEntity<UserResponseDto> createUser(UserRequestDto userRequestDto);

    ResponseEntity<UserResponseDto> updateUser(UserRequestDto userRequestDto);

    void deleteUser(Long id);
}
