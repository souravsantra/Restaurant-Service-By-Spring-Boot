package com.souravrestaurant.restaurantspringbootapp.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.souravrestaurant.restaurantspringbootapp.model.OrderDetails;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Long>{

	List<OrderDetails> findByOrderOrderDeliveredTime(Date orderDeliveredTime);

}
