package com.storecom.userservice.service;

import com.storecom.userservice.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    ResponseEntity<List<User>> getAllUsers();

    Optional<User> getUserById(Long id);

    ResponseEntity<User> createUser(User user);

    ResponseEntity<User> updateUser(Long id, User updatedUser);

    void deleteUser(Long id);
}
