package com.souravrestaurant.restaurantspringbootapp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "restaurant_order")
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7606137848363342852L;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	@Column
	private String orderStatus;
	@Column
	private String orderDescription;
	@Column
	@CreationTimestamp
	private Date orderRecivedTime;
	@Column
	private Date orderDeliveredTime;
	@Column
	private Double orderAmmount;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stuff_id")
	private RestaurantStuff restaurantStuff;

	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<OrderDetails> orderDetails;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderRecivedTime() {
		return orderRecivedTime;
	}

	public void setOrderRecivedTime(Date orderRecivedTime) {
		this.orderRecivedTime = orderRecivedTime;
	}

	public Date getOrderDeliveredTime() {
		return orderDeliveredTime;
	}

	public void setOrderDeliveredTime(Date orderDeliveredTime) {
		this.orderDeliveredTime = orderDeliveredTime;
	}

	public Double getOrderAmmount() {
		return orderAmmount;
	}

	public void setOrderAmmount(Double orderAmmount) {
		this.orderAmmount = orderAmmount;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public RestaurantStuff getRestaurantStuff() {
		return restaurantStuff;
	}

	public void setRestaurantStuff(RestaurantStuff restaurantStuff) {
		this.restaurantStuff = restaurantStuff;
	}

	@JsonManagedReference
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
