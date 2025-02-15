package com.amitu.order.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.amitu.order.dto.FoodItemDto;
import com.amitu.order.dto.Restaurant;
import com.amitu.order.dto.UserDTO;

@Document("order")
public class Order {
	
	private Integer orderId;
    private List<FoodItemDto> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;
    
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Integer orderId, List<FoodItemDto> foodItemsList, Restaurant restaurant, UserDTO userDTO) {
		this.orderId = orderId;
		this.foodItemsList = foodItemsList;
		this.restaurant = restaurant;
		this.userDTO = userDTO;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public List<FoodItemDto> getFoodItemsList() {
		return foodItemsList;
	}

	public void setFoodItemsList(List<FoodItemDto> foodItemsList) {
		this.foodItemsList = foodItemsList;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
    
	
    
    
    

}
