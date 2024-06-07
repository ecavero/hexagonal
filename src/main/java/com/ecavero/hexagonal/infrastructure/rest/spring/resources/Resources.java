package com.ecavero.hexagonal.infrastructure.rest.spring.resources;

import com.ecavero.hexagonal.application.service.UserService;
import com.ecavero.hexagonal.infrastructure.rest.spring.dto.UserDto;
import com.ecavero.hexagonal.infrastructure.rest.spring.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class Resources {
    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping("users/user/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
        return new ResponseEntity<>(userMapper.toDto(userService.getUser(id)), HttpStatus.OK);
    }

    @PostMapping("users")
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(userMapper.toDto(userService.saveUser(userMapper.toDomain(userDto))), HttpStatus.CREATED);
    }
}
