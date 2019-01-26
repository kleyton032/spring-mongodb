package com.kleytonjoao.springmongodb.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kleytonjoao.springmongodb.domain.User;

@RestController
@RequestMapping("/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> getFindAll(){
		User kleyt = new User("1", "kleyton", "kleyton@gmail.com");
		User joao = new User("2", "João", "joao@gmail.com");
		User jose = new User("3", "José", "jose@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(kleyt, joao, jose));
		return ResponseEntity.ok().body(list);
		
	}
	
	
}
