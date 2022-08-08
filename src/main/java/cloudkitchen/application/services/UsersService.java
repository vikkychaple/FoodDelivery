package cloudkitchen.application.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import cloudkitchen.application.exception.NullObjectException;
import cloudkitchen.application.exception.ResourceNotFoundException;
import cloudkitchen.application.models.Users;
import cloudkitchen.application.repository.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository userRepository;
	
	public Users addUser(Users user) {
		Users newUser= user;
		if(newUser==null) {
			throw new NullObjectException("User object is empty"); 
		}
		else {
			return userRepository.save(newUser);
		}
		
	}
	
	public List<Users> getAllUsers(){
		List<Users> userList= new ArrayList<Users>();
		Iterable<Users> iterable= userRepository.findAll();
		iterable.forEach(user -> {
			userList.add(user);
		});
		if(userList.size()==0) {
			throw new ResourceNotFoundException("No Users found in the DATABASE");
		}
		return userList;
	}
	public Users validateUser(String username, String password) {
		Users user=userRepository.findByUsernameAndPassword(username, password);
		if(user==null) {
			throw new NullObjectException("No User Found with this Username and Password in the DATABASE");
		}
		return user;
	}
	
	public Boolean deleteUser(String username,String password) {
		Users user=userRepository.findByUsernameAndPassword(username, password);
		if(user==null) {
			throw new NullObjectException("No User found with this username and password in the DATABASE");
		}
		else {
		userRepository.delete(user);
		return true;
		}
		
	}
//	@Query(value="update ")
	public Users updateUser(Users user,String username, String password) {
		if(user==null) {
			throw new NullObjectException("User object is empty");
		}
		else {
			Users oldUser=userRepository.findByUsernameAndPassword(username, password);
			user.setUserId(oldUser.getUserId());
			return userRepository.save(user);
		}
	}

}
