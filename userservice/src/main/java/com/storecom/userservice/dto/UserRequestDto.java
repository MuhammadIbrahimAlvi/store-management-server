package com.storecom.userservice.dto;

public record UserRequestDto(Long id,
                             String name,
                             String email,
                             String password,
                             String address,
                             String city,
                             String zip) {
}
