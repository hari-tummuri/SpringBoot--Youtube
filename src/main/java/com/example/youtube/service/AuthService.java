package com.example.youtube.service;

import com.example.youtube.Dto.UserDto;
import com.example.youtube.model.User;
import com.example.youtube.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private AuthRepository authRepository;


    public void createUser(UserDto userDto) {
        User user=new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        authRepository.save(user);
    }

    public void login(UserDto userDto) {

    }
}
