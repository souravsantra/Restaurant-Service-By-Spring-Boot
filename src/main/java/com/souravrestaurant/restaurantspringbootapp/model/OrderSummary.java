package com.souravrestaurant.restaurantspringbootapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Table(name = "order_summary", catalog = "restaurant")
@Entity
@NamedStoredProcedureQueries({
	
	@NamedStoredProcedureQuery(name = "getOrderSummary", procedureName = "GET_ORDER_SUMMARIES", resultClasses = {
			OrderSummary.class }, parameters = {
					@StoredProcedureParameter(name = "IN_DATE", type = String.class, mode = ParameterMode.IN)
					})})
public class OrderSummary implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 493474066389181829L;
	
	
	


	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	
	@Column
	private String orderStatus;
	@Column
	private String orderDescription;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderRecivedTime;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDeliveredTime;
	@Column
	private Double orderAmmount;
	
	@Column
	private Long staffId;
	
	@Column
	private Long mealQuantity;
	@Column
	private Double unitPrice;
	@Column
	private Double TotalPrice;
	@Column
	private String mealName;
	
	@Column
	private Long mealDeleverdCount;
	
	@Column
	private Long mealStockCount;

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

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
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

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
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

	public String getMealName() {
		return mealName;
	}

	public void setMealName(String mealName) {
		this.mealName = mealName;
	}

	public Long getMealDeleverdCount() {
		return mealDeleverdCount;
	}

	public void setMealDeleverdCount(Long mealDeleverdCount) {
		this.mealDeleverdCount = mealDeleverdCount;
	}

	public Long getMealStockCount() {
		return mealStockCount;
	}

	public void setMealStockCount(Long mealStockCount) {
		this.mealStockCount = mealStockCount;
	}
	
	public OrderSummary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderSummary(Long orderId, String orderStatus, String orderDescription, Date orderRecivedTime,
			Date orderDeliveredTime, Double orderAmmount, Long staffId, Long mealQuantity, Double unitPrice,
			Double totalPrice, String mealName, Long mealDeleverdCount, Long mealStockCount) {
		super();
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.orderDescription = orderDescription;
		this.orderRecivedTime = orderRecivedTime;
		this.orderDeliveredTime = orderDeliveredTime;
		this.orderAmmount = orderAmmount;
		this.staffId = staffId;
		this.mealQuantity = mealQuantity;
		this.unitPrice = unitPrice;
		TotalPrice = totalPrice;
		this.mealName = mealName;
		this.mealDeleverdCount = mealDeleverdCount;
		this.mealStockCount = mealStockCount;
	}

	@Override
	public String toString() {
		return "OrderSummary [orderId=" + orderId + ", orderStatus=" + orderStatus + ", orderDescription="
				+ orderDescription + ", orderRecivedTime=" + orderRecivedTime + ", orderDeliveredTime="
				+ orderDeliveredTime + ", orderAmmount=" + orderAmmount + ", staffId=" + staffId + ", mealQuantity="
				+ mealQuantity + ", unitPrice=" + unitPrice + ", TotalPrice=" + TotalPrice + ", mealName=" + mealName
				+ ", mealDeleverdCount=" + mealDeleverdCount + ", mealStockCount=" + mealStockCount + "]";
	}
	
	
}
