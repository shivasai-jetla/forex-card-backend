package com.forexcard.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forexcard.model.User;
import com.forexcard.repo.UserRepository;
import com.forexcard.util.JwtUtil;


@Service
public class AuthService {
	    @Autowired
	    private UserRepository userRepository;

	    @Autowired
	    private JwtUtil jwtUtil;

	    public String login(String email, String password) {
	        Optional<User> userOpt = userRepository.findByEmail(email);

	        if (userOpt.isPresent()) {
	            User user = userOpt.get();
	            if (user.getPassword().equals(password)) {
<<<<<<< HEAD
	                return jwtUtil.generateToken(email); // 🔐 generate token on valid credentials
	            }
	        }

	        return null; // ❌ invalid
=======
	                return jwtUtil.generateToken(email);
	            }
	        }

	        return null; 
	    }
	    
	    public String getUserByEmail(String email)
	    {
	    	return userRepository.getUserByEmail(email);
>>>>>>> 0efe502 (Added 4 entities)
	    }

}
