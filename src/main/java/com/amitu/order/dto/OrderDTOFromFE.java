package com.amitu.order.dto;

import java.util.List;

public class OrderDTOFromFE {
	private List<FoodItemDto> foodItemsList;
    private Integer userId;
    private Restaurant restaurant;
    
	public OrderDTOFromFE() {
		// TODO Auto-generated constructor stub
	}

	public OrderDTOFromFE(List<FoodItemDto> foodItemsList, Integer userId, Restaurant restaurant) {
		this.foodItemsList = foodItemsList;
		this.userId = userId;
		this.restaurant = restaurant;
	}

	public List<FoodItemDto> getFoodItemsList() {
		return foodItemsList;
	}

	public void setFoodItemsList(List<FoodItemDto> foodItemsList) {
		this.foodItemsList = foodItemsList;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "OrderDTOFromFE [foodItemsList=" + foodItemsList + ", userId=" + userId + ", restaurant=" + restaurant
				+ "]";
	}
}
