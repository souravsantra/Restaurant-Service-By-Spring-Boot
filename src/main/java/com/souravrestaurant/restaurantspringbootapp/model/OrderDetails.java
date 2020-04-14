package com.souravrestaurant.restaurantspringbootapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table
public class OrderDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5611646792609668888L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderDetailId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	private Order order;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "meal_id")
	private Meals meal;

	@Column
	private Long mealQuantity;
	@Column
	private Double unitPrice;
	@Column
	private Double TotalPrice;
	public Long getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(Long orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	
	@JsonBackReference
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Meals getMeal() {
		return meal;
	}
	public void setMeal(Meals meal) {
		this.meal = meal;
	}
	public Long getMealQuantity() {
		return mealQuantity;
	}
	public void setMealQuantity(Long mealQuantity) {
		this.mealQuantity = mealQuantity;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Double getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		TotalPrice = totalPrice;
	}

	
}
