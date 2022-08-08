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

import cloudkitchen.application.models.MenuItem;
import cloudkitchen.application.models.Restaurants;
import cloudkitchen.application
.services.RestaurantsService;

@RestController
public class RestaurantsController {
	@Autowired
	private RestaurantsService restaurantService;
	
	@PostMapping(value="/restaurant")
	public Restaurants addRestaurant(@RequestBody Restaurants restaurant) {
		return restaurantService.addRestaurant(restaurant);
		
	}
	
	@GetMapping(value="/restaurant")
	public List<Restaurants> getAllRestaurants(){
		return restaurantService.getAllRestaurants();
	}
	
	@GetMapping(value="/restaurant/{restaurantUsername}/{restaurantPassword}")
	public Restaurants validateRestaurant(@PathVariable("restaurantUsername")String restaurantUsername, @PathVariable("restaurantPassword") String restaurantPassword) {
		return restaurantService.validateRestaurant(restaurantUsername, restaurantPassword);
		
	}
	@DeleteMapping(value="/restaurant/{restaurantUsername}/{restaurantPassword}")
	public Boolean deleteRestaurant(@PathVariable("restaurantUsername")String restaurantUsername, @PathVariable("restaurantPassword") String restaurantPassword) {
		return restaurantService.deleteRestaurant(restaurantUsername, restaurantPassword);
	}
	@GetMapping(value="/restaurant/{restaurantUsername}")
	public Restaurants getRestaurantByUsername(@PathVariable("restaurantUsername") String restaurantUsername) {
			return restaurantService.getRestaurantByUsername(restaurantUsername);
	}
	@PutMapping(value="/restaurant/{restaurantUsername}/{restaurantPassword}")
	public Restaurants updateRestaurant(@PathVariable(value="restaurantUsername")String restaurantUsername, @PathVariable("restaurantPassword")String restaurantPassword, @RequestBody Restaurants restaurant) {
		Restaurants oldRestaurant= this.validateRestaurant(restaurantUsername, restaurantPassword);
		restaurant.setRestaurantId(oldRestaurant.getRestaurantId());
		return restaurantService.updateRestaurant(restaurant);
	}
//	}
//	@PostMapping(value="/restaurant/addFood/{restaurantUsername}")
//	public Restaurants addFoodInRestaurant(@PathVariable(value="restaurantUsername") String restaurantUsername,@RequestBody MenuItem food) {
//		return restaurantService.addFoodInRestaurant(restaurantUsername,food); 
//	}
//	@PostMapping(value="/restaurant/deleteFood/{restaurantUsername}")
//	public Boolean deleteFoodFromRestaurant(@PathVariable(value="restaurantUsername") String restaurantUsername, @RequestBody MenuItem food) {
//		return restaurantService.deleteFoodFromRestaurant(restaurantUsername,food);
//	}


}
