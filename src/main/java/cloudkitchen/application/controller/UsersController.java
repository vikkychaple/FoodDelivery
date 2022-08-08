package cloudkitchen.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cloudkitchen.application.models.Users;
import cloudkitchen.application.services.UsersService;

@RestController
public class UsersController {
	@Autowired
	private UsersService userService;
	
	@PostMapping(value="/user")
	public Users addUser(@RequestBody Users user) {
		
		return userService.addUser(user);
	}
	
	
	@GetMapping(value="/user")
	public List<Users> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping(value="/user/{username}/{password}")
	public Users validateUsers(@PathVariable("username") String username, @PathVariable("password") String password) {
		return userService.validateUser(username, password);
	}
	

	@DeleteMapping(value="/user/{username}/{password}")
	public Boolean deleteUser(@PathVariable("username") String username, @PathVariable("password") String password) {
		return userService.deleteUser(username, password);
	}
	@PutMapping(value="/user/{username}/{password}")
	public Users updateUser(@RequestBody Users user, @PathVariable(value="username") String username, @PathVariable(value="password") String password) {
		return userService.updateUser(user,username,password);
	}
}
