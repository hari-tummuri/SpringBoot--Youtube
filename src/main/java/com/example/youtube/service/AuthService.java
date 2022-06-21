package com.example.youtube.service;

import com.example.youtube.Dto.UserDto;
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

    public boolean login(String username,String password) {
        ArrayList<User> users=new ArrayList<User>() ;
        users.addAll(authRepository.findAll());
        for(User user:users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password))
                return true;
        }
        return false;
    }
}
