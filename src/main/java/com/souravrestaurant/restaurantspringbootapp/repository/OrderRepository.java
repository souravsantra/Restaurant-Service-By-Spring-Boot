package com.souravrestaurant.restaurantspringbootapp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.souravrestaurant.restaurantspringbootapp.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	@Query("SELECT o FROM Order o WHERE o.orderDeliveredTime  between  concat(:orderDeliveredTime,' 00:00:00') and concat(:orderDeliveredTime,' 23:59:59')  "
			+ " and o.orderStatus = 'Delivered'")
	public List<Order> getOrdersByDeliveryDate(@Param("orderDeliveredTime") String orderDeliveredTime);

	@Transactional
	@Modifying
	@Query("Update Order o set o.orderStatus = :orderStatus ,o.orderDeliveredTime  = CURRENT_TIMESTAMP  WHERE o.orderId = :orderId")
	public void updateOrder(@Param("orderId") Long orderId, @Param("orderStatus") String orderStatus);
}
