package com.shelly.coupons.controller;


import com.shelly.coupons.entities.UserEntity;
import com.shelly.coupons.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserLogic userLogic;
	
	@PostMapping
	public void createUser(@RequestBody UserEntity user) {
		userLogic.createUser(user);
	}
	
	@PutMapping
	public void updateUser(@RequestBody UserEntity user) {
	}
	
	@GetMapping("/{id}")
	public UserEntity getUser(@PathVariable("id") long id) {
		return userLogic.getUser(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") long id) {
		userLogic.deleteUser(id);
	}
	
	@GetMapping("/byName")
	public List<UserEntity> findByName(@RequestParam("name") String name){
		return this.userLogic.findByName(name);
	}
	
	@GetMapping("/byData")
	public List<UserEntity> getByData(@RequestParam("name") String name, 
									  @RequestParam("age") int age){
		return this.userLogic.getByData(name, age);
	}
}
