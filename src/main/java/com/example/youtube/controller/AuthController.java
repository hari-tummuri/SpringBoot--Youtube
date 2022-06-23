package com.example.youtube.controller;

import com.example.youtube.Dto.UserDto;
import com.example.youtube.Dto.UserLoginDto;
import com.example.youtube.model.User;
import com.example.youtube.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(
        origins = {"http://localhost:4200/"},
        allowCredentials = "true",
        allowedHeaders = {"*"},
        exposedHeaders = {"*"},
        maxAge = 60 * 30,
        methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT}
)
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
    public User login(@RequestBody UserLoginDto userLoginDto) {

        return authService.login(userLoginDto);
    }
}
