package com.souravrestaurant.restaurantspringbootapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table
public class Meals implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -759524477119347692L;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mealId;
	@Column
	private String mealName;
	@Column
	private String mealDescription;
	@Column
	private String mealCatagory;
	@Column
	private Double unitPrice;
	@Column
	private Boolean active;
	@Column
	private Integer totalQuantity;
	
	@CreationTimestamp
	@Column
	private Date mealAddDate;

	public Long getMealId() {
		return mealId;
	}

	public void setMealId(Long mealId) {
		this.mealId = mealId;
	}

	public String getMealName() {
		return mealName;
	}

	public void setMealName(String mealName) {
		this.mealName = mealName;
	}

	public String getMealDescription() {
		return mealDescription;
	}

	public void setMealDescription(String mealDescription) {
		this.mealDescription = mealDescription;
	}

	public String getMealCatagory() {
		return mealCatagory;
	}

	public void setMealCatagory(String mealCatagory) {
		this.mealCatagory = mealCatagory;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public Date getMealAddDate() {
		return mealAddDate;
	}

	public void setMealAddDate(Date mealAddDate) {
		this.mealAddDate = mealAddDate;
	}



}
