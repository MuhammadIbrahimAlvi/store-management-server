package com.storecom.userservice.service;

import com.storecom.userservice.dto.UserRequestDto;
import com.storecom.userservice.dto.UserResponseDto;
import com.storecom.userservice.entity.User;
import com.storecom.userservice.repository.UserRepository;
import com.storecom.userservice.util.ConversionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ConversionUtil conversionUtil;

    public ResponseEntity<List<UserResponseDto>> getAllUsers() {
        return ResponseEntity.ok(conversionUtil.map(userRepository.findAll(),
                UserResponseDto.class));
    }

    public ResponseEntity<UserResponseDto> getUserById(Long id) {
        UserResponseDto userResponseDto = conversionUtil.mapItem(userRepository.findById(id), UserResponseDto.class);
        return ResponseEntity.ok(userResponseDto);
    }

    public ResponseEntity<UserResponseDto> createUser(UserRequestDto userRequestDto) {

        UserResponseDto responseDto = conversionUtil.mapItem(userRepository.save(User.builder()
                .id(userRequestDto.id())
                .name(userRequestDto.name())
                .email(userRequestDto.email())
                .zip(userRequestDto.zip())
                .city(userRequestDto.city())
                .password(userRequestDto.password())
                .address(userRequestDto.address())
                .build()), UserResponseDto.class);

        return ResponseEntity.ok(responseDto);
    }

    public ResponseEntity<UserResponseDto> updateUser(UserRequestDto userRequestDto) {
            User user = conversionUtil.mapItem(userRequestDto, User.class);
            UserResponseDto userResponseDto = conversionUtil.mapItem(userRepository.save(user)
                    , UserResponseDto.class);
            return ResponseEntity.ok(userResponseDto);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
