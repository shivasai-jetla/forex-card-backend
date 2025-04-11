package com.forexcard.controller;



import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.forexcard.model.User;
import com.forexcard.service.ApplyCardService;

@RestController
@RequestMapping("/card")
@CrossOrigin(origins = "*") // Add this if you're connecting from frontend like React
public class ApplyCardController {
	
	@Autowired
	private ApplyCardService applycardservice;
	
	@PutMapping("/apply/{id}")
	public User applyCardById(@PathVariable Integer id, @RequestBody User updatedData) {
	    return applycardservice.applyCardById(id, updatedData);
	}
	
	//optional to admin to view all the applications
	
	@GetMapping("/all")
	public List<User> getAllApplications(){
		return  applycardservice.getAllApplications();
		
	}
	
	
	
	
<<<<<<< HEAD
=======
	
>>>>>>> 0efe502 (Added 4 entities)

}
