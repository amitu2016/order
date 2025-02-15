package com.amitu.order.dto;

import java.util.List;

public class OrderDTO {
	private Integer orderId;
    private List<FoodItemDto> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;
    
	public OrderDTO() {
		// TODO Auto-generated constructor stub
	}

	public OrderDTO(Integer orderId, List<FoodItemDto> foodItemsList, Restaurant restaurant, UserDTO userDTO) {
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

	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", foodItemsList=" + foodItemsList + ", restaurant=" + restaurant
				+ ", userDTO=" + userDTO + "]";
	}
    
}
