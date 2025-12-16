package com.authentication_and_authorization.Service;

import com.authentication_and_authorization.DTO.SignupRequest;
import com.authentication_and_authorization.Repository.UserRepository;
import com.authentication_and_authorization.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public void registerUser(SignupRequest req){
        if(userRepository.existsByEmail(req.getEmail())){
            throw new RuntimeException("User already Exist!"); //checks if user already exist
        }
        User user=new User(); //passing the data by creating an object
        user.setUsername(req.getUsername());
        user.setEmail(req.getEmail());
        user.setPassword(passwordEncoder.encode(req.getPassword()));
        userRepository.save(user);
    }


}
