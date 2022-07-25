package fooddelivery.DAOS;
import java.util.ArrayList;
import java.util.List;

import fooddelivery.models.Restaurant;

//Fill the Code
public class RestaurantDAO {

	static List<Restaurant> restaurantList = new ArrayList<>();
	
	static {
	restaurantList.add(new Restaurant("1","Khabib's Restaurant","756876567","Nagpur, Maharashtra","khabib@gmail.com","khabib"));
	restaurantList.add(new Restaurant("2","Mehar Restaurant","756873457","Nagpur, Maharashtra","mehar@gmail.com","mehar"));
	restaurantList.add(new Restaurant("1","Ajju's Biryani","7968886567","Nagpur, Maharashtra","ajju@gmail.com",""));


	}
	
	public List<Restaurant> list() {
		return restaurantList;
	}
	
	public Restaurant get(String id) {
		Restaurant restaurant= null;
		for(Restaurant restrnt: restaurantList) {
			if(restrnt.getRestauantID()==id) {
				restaurant=restrnt;
			}
		}
		return restaurant;
	}
	
	public Restaurant create(Restaurant restaurant) {
		this.restaurantList.add(restaurant);
		return restaurant;
	}
	
	public Boolean update(Restaurant restaurant) {
		for(int i=0;i<restaurantList.size();i++) {
			if(restaurant.getRestauantID()==restaurantList.get(i).getRestauantID()) {
				restaurantList.remove(i);
				restaurantList.add(i, restaurant);
				return true;
			}
		}
		return false;
	}
	
	public Boolean delete(String id) {
		for(Restaurant restrnt: restaurantList) {
			if(restrnt.getRestauantID()==id) {
				restaurantList.remove(restrnt);
				return true;
			}
		}
		return false;
	}
}
