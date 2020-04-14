package com.souravrestaurant.restaurantspringbootapp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souravrestaurant.restaurantspringbootapp.model.Order;
import com.souravrestaurant.restaurantspringbootapp.model.OrderDetails;
import com.souravrestaurant.restaurantspringbootapp.model.OrderSummary;
import com.souravrestaurant.restaurantspringbootapp.repository.OrderDetailsRepository;
import com.souravrestaurant.restaurantspringbootapp.repository.OrderRepository;
import com.souravrestaurant.restaurantspringbootapp.repository.OrderSummaryCustomRepositoryImpl;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderDetailsRepository orderDetailsRepository;

	@Autowired
	OrderSummaryCustomRepositoryImpl orderSummaryCustomRepository;

	public Order getOrdersById(Long orderId) {
		return orderRepository.findById(orderId).get();
	}

	public List<Order> getOrdersByDeliveryDate(String deliveryDate) {
		return orderRepository.getOrdersByDeliveryDate(deliveryDate);
	}

	public List<OrderDetails> findByDeliveryDate(String orderDeliveredTime) {
		Date deliveryDate = null;
		try {
			deliveryDate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(orderDeliveredTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("deliveryDate--" + deliveryDate);
		return orderDetailsRepository.findByOrderOrderDeliveredTime(deliveryDate);
	}

	public List<OrderSummary> getOrderSummary(String date) {
		return orderSummaryCustomRepository.getOrderSummary(date);
	}

	public void save(Order order) {
		orderRepository.save(order);

	}

	public void update(Order order) {
		orderRepository.updateOrder(order.getOrderId(), order.getOrderStatus());

	}

}
