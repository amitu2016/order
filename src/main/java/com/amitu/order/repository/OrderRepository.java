package com.amitu.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amitu.order.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer>{

}
