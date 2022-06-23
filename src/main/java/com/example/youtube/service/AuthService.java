package com.example.youtube.service;

import com.example.youtube.Dto.UserDto;
import com.example.youtube.Dto.UserLoginDto;
import com.example.youtube.model.User;
import com.example.youtube.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthService {
    @Autowired
    private AuthRepository authRepository;


    public void createUser(UserDto userDto) {
        User user=new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setChannel(userDto.getChannel());
        user.setLogo(userDto.getLogo());
        authRepository.save(user);
    }

    public User login(UserLoginDto userLoginDto) {
        return (User) authRepository.findByUsernameAndPassword(userLoginDto.getUsername(), userLoginDto.getPassword());

    }
}
