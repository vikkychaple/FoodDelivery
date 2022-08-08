package cloudkitchen.application.repository;

import org.springframework.data.repository.CrudRepository;

import cloudkitchen.application.models.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {
	
	public Users findByUsernameAndPassword(String username, String password);
	

}
