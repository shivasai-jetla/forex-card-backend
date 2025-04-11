package com.forexcard.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forexcard.model.ForexCard;
import com.forexcard.model.User;
import com.forexcard.service.UserRegisterService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserRegisterController {
	
	@Autowired
	UserRegisterService service;
	
	    @PostMapping("/addUser")
	    public ResponseEntity<Map<String, Object>> addUser(@RequestBody User user)
	    {
	   
		 String result = service.addUser(user);
		 
		 boolean success = result.equals("Register successful");
	     HttpStatus status = success ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;

	      Map<String, Object> response = new HashMap<>();
	      response.put("message", result);
	      response.put("success", success);

	      return new ResponseEntity<>(response, status);
	    	
	    }

}
