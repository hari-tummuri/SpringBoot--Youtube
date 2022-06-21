package com.example.youtube.controller;

import com.example.youtube.Dto.UserDto;
import com.example.youtube.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("api/auth/")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/signUp")
    public ResponseEntity createUser(@RequestBody UserDto userDto) {
        authService.createUser(userDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public boolean login(@RequestBody String username, String password) {
        if (authService.login(username, password))
            return true;
        return false;

    }
}
