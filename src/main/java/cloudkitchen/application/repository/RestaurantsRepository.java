package cloudkitchen.application.repository;

import org.springframework.data.repository.CrudRepository;

import cloudkitchen.application.models.Restaurants;

public interface RestaurantsRepository extends CrudRepository<Restaurants, Integer> {
	public Restaurants findByRestaurantUsernameAndRestaurantPassword(String restaurantUsername, String restaurantPassword);
	public Restaurants findByRestaurantUsername(String restaurantUsername);

}
