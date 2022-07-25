package fooddelivery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fooddelivery.DAOS.*;


import fooddelivery.models.Restaurant;

@RestController
@RequestMapping(value="/restaurant")
public class RestaurantController {
	@Autowired
	RestaurantDAO restaurantDao=new RestaurantDAO();
	@GetMapping(value="/list")
	public List<Restaurant> list(){
		return restaurantDao.list();
	}
	@PostMapping(value="/create")
	public Restaurant create(@RequestBody Restaurant restaurant) {
		return restaurantDao.create(restaurant);
	}
	@GetMapping(value="/show/{id}")
	public Restaurant show(@PathVariable String id) {
		return restaurantDao.get(id);
	}
	@PostMapping(value="/update/{id}")
	public Restaurant update(@PathVariable String id, @RequestBody Restaurant restaurant) {
		if (restaurantDao.update(restaurant)) {
			return restaurantDao.get(id);
		}
		return null;
	}
	@DeleteMapping(value="/delete/{id}")
	public Boolean delete(@PathVariable String id) {
		return restaurantDao.delete(id);
	}
	

}
