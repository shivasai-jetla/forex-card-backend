package com.forexcard.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
=======
import com.forexcard.model.User;
>>>>>>> 0efe502 (Added 4 entities)
import com.forexcard.service.AuthService;

@RestController
@CrossOrigin
public class AuthController {
	

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");

        String token = authService.login(email, password);
<<<<<<< HEAD
=======
        
        User 
>>>>>>> 0efe502 (Added 4 entities)

        if (token != null) {
            Map<String, String> response = new HashMap<>();
            response.put("token", token);
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }
<<<<<<< HEAD
=======
    
    
   
>>>>>>> 0efe502 (Added 4 entities)

}
