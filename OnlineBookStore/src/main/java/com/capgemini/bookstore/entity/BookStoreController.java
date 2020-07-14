package com.capgemini.bookstore.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
//@CrossOrigin("http://localhost:4200")
public class BookStoreController {
	
	@Autowired
	CategoryService cs;
	
	@PostMapping("/addCat")
	public Category addUser(@RequestBody Category c){
		Category ct=cs.add(c);
		return c;
	}
	

}
