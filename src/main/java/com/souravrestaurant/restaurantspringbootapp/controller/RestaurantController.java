package com.souravrestaurant.restaurantspringbootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.souravrestaurant.restaurantspringbootapp.model.Meals;
import com.souravrestaurant.restaurantspringbootapp.model.Order;
import com.souravrestaurant.restaurantspringbootapp.model.OrderDetails;
import com.souravrestaurant.restaurantspringbootapp.model.OrderSummary;
import com.souravrestaurant.restaurantspringbootapp.model.RestaurantStuff;
import com.souravrestaurant.restaurantspringbootapp.service.MealsService;
import com.souravrestaurant.restaurantspringbootapp.service.OrderService;
import com.souravrestaurant.restaurantspringbootapp.service.StuffService;


@RestController
public class RestaurantController {

	@Autowired
	private MealsService mealsService;

	@Autowired
	private StuffService stuffService;

	@Autowired
	private OrderService orderService;

	//Enter different kinds of meals/dishes that his restaurant serves
	@PostMapping("/meals")
	private Long saveMeal(@RequestBody Meals meals) {
		mealsService.saveOrUpdate(meals);
		return meals.getMealId();
	}

	//View the list of all different kinds of meals/dishes the restaurant servers
	@GetMapping("/meals")
	private List<Meals> getAllMeals() {
		return mealsService.getAllMeals();
	}

	//Add Restaurent Stuff
	@PostMapping("/stuffs")
	private Long saveStuff(@RequestBody RestaurantStuff restaurantStuff) {
		stuffService.saveOrUpdate(restaurantStuff);
		return restaurantStuff.getStuffId();
	}

	//Get Orders by Order Id
	@GetMapping("/orders/{orderId}")
	private Order getOrders(@PathVariable("orderId") Long orderId) {
		return orderService.getOrdersById(orderId);
	}

	//Keep track of time particular order was placed and then delivered
	//Based on particular date
	@GetMapping("/orderByDeliveryDate/{deliveryDate}")
	private List<Order> getOrdersByDeliveryDate(@PathVariable("deliveryDate") String deliveryDate) {
		return orderService.getOrdersByDeliveryDate(deliveryDate);
	}

	@GetMapping("/ordersByDate/{orderDeliveredTime}")
	private List<OrderDetails> findByDeliveryDate(@PathVariable("orderDeliveredTime") String orderDeliveredTime) {

		return orderService.findByDeliveryDate(orderDeliveredTime);
	}

	//View the statistics on how many of each meal/dish has been served
	//Keep track of how many of the above has been served throughout the day
	@GetMapping("/ordersByDeliverDate/{date}")
	private List<OrderSummary> getOrderSummary(@PathVariable("date") String date) {

		return orderService.getOrderSummary(date);
	}

	//Place Order
	@PostMapping("/order")
	private Long saveOrder(@RequestBody Order order) {
		orderService.save(order);
		return order.getOrderId();
	}

	//Order Status update and delivered Date update
	@PutMapping("/order")
	private Order updateOrder(@RequestBody Order order) {
		orderService.update(order);
		return order;
	}
}
