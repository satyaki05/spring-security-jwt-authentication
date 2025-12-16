package com.authentication_and_authorization.Service;
import com.authentication_and_authorization.DTO.LoginRequest;
import com.authentication_and_authorization.Util.JWTUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class AuthService {
    private final JWTUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;
    public String login(LoginRequest request){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(),request.getPassword()));
        String token = jwtUtil.generateToken(request.getEmail());
        return token;
    }
}
