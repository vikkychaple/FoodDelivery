package cloudkitchen.application.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import cloudkitchen.application.exception.NullObjectException;
import cloudkitchen.application.exception.ResourceNotFoundException;
import cloudkitchen.application.models.MenuItem;
import cloudkitchen.application.models.Restaurants;
import cloudkitchen.application.repository.RestaurantsRepository;

@Service
public class RestaurantsService {
	@Autowired
	private RestaurantsRepository restaurantsRepository;
	
	public Restaurants addRestaurant(Restaurants restaurant) {
		Restaurants newRestaurant=restaurant;
		if(newRestaurant==null) {
			throw new NullObjectException("No restaurant Object Found");
		}
		else {
			return restaurantsRepository.save(newRestaurant);
		}
		
	}
	
	public List<Restaurants> getAllRestaurants(){
		Iterable<Restaurants> iterable= restaurantsRepository.findAll();
		List<Restaurants> restaurantsList= new ArrayList<Restaurants>();
		iterable.forEach(restaurant -> {
			restaurantsList.add(restaurant);
		});
		if(restaurantsList.size()==0) {
			throw new ResourceNotFoundException("No restaurants Found in the Database");
		}
		else {
			return restaurantsList;
		}
	}
	public Restaurants validateRestaurant(String restaurantUsername, String restaurantPassword) {
		Restaurants restaurant=restaurantsRepository.findByRestaurantUsernameAndRestaurantPassword(restaurantUsername, restaurantPassword);
		if(restaurant==null) {
			throw new NullObjectException("No Restaurant with this username and Password found in DataBase");
		}
		else {
			return restaurant;
		}
	}
	public Boolean deleteRestaurant(String restaurantUsername, String restaurantPassword) {
		Restaurants restaurant= restaurantsRepository.findByRestaurantUsernameAndRestaurantPassword(restaurantUsername, restaurantPassword);
		if(restaurant==null) {
			throw new ResourceNotFoundException("No Restaurant found with this username and Password in the Database");
		}
		else {
			restaurantsRepository.delete(restaurant);
			return true;
		}
	}
	
	public Restaurants getRestaurantByUsername(String restaurantUsername) {
		Restaurants restaurant=restaurantsRepository.findByRestaurantUsername(restaurantUsername);
		if(restaurant==null) {
			throw new NullObjectException("No Restaurant with the username exists");
		}
		else {
			return restaurant;
		}
		
	}
	
	public Restaurants updateRestaurant(Restaurants restaurant) {
		return restaurantsRepository.save(restaurant);

	}
}
