package com.amitu.order.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.amitu.order.dto.OrderDTO;
import com.amitu.order.dto.OrderDTOFromFE;
import com.amitu.order.dto.UserDTO;
import com.amitu.order.entity.Order;
import com.amitu.order.mapper.OrderMapper;
import com.amitu.order.repository.OrderRepository;

@Service
public class OrderService {
	
	private final OrderRepository orderRepository;
	
	private final SequenceGenerator sequenceGenerator;
	
	private final RestTemplate restTemplate;

	

	public OrderService(OrderRepository orderRepository, SequenceGenerator sequenceGenerator,
			RestTemplate restTemplate) {
		this.orderRepository = orderRepository;
		this.sequenceGenerator = sequenceGenerator;
		this.restTemplate = restTemplate;
	}



	public OrderDTO saveOrderInDb(OrderDTOFromFE orderDetails) {
        Integer newOrderID = sequenceGenerator.generateNextOrderId();
        UserDTO userDTO = fetchUserDetailsFromUserId(orderDetails.getUserId());
        Order orderToBeSaved = new Order(newOrderID, orderDetails.getFoodItemsList(), orderDetails.getRestaurant(), userDTO );
        orderRepository.save(orderToBeSaved);
        return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderToBeSaved);
    }

    private UserDTO fetchUserDetailsFromUserId(Integer userId) {
       return restTemplate.getForObject("http://USERINFORMATION/user/fetchUserById/" + userId, UserDTO.class);
    }
	
	
}
