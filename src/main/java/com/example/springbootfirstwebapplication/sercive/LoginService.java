package com.example.springbootfirstwebapplication.sercive;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class LoginService {

    public boolean validateUser(String userId, String password) {
        return userId.equalsIgnoreCase("famous") && password.equalsIgnoreCase("dummy");
    }
}
