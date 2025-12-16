package com.authentication_and_authorization.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/secure")
    public String secureEndpoint() {
        return "JWT WORKING ✅";
    }
}
