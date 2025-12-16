package com.authentication_and_authorization.Controller;

import com.authentication_and_authorization.Service.AuthService;
import com.authentication_and_authorization.Service.UserService;
import com.authentication_and_authorization.DTO.LoginRequest;
import com.authentication_and_authorization.DTO.SignupRequest;

import com.authentication_and_authorization.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(
            @RequestBody SignupRequest request){
        userService.registerUser(request);
        return ResponseEntity.ok("User registered successfully");
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(
            @RequestBody LoginRequest request){
        String token=authService.login(request);
        return ResponseEntity.ok(token);
    }


}
