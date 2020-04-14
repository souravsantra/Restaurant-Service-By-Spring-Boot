package com.souravrestaurant.restaurantspringbootapp.repository;

import java.util.List;

import com.souravrestaurant.restaurantspringbootapp.model.OrderSummary;

public interface OrderSummaryCustomRepository {

	List<OrderSummary> getOrderSummary(String date);

}
