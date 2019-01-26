package com.kleytonjoao.springmongodb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kleytonjoao.springmongodb.domain.User;
import com.kleytonjoao.springmongodb.service.UserService;

@RestController
@RequestMapping("/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> getFindAll(){
	
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	
}
