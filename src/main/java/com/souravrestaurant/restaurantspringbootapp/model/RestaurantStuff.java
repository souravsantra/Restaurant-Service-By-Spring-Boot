package com.souravrestaurant.restaurantspringbootapp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity  
@Table
public class RestaurantStuff implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -79108806379231603L;
	@Id  
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stuffId;
	@Column
	private String name;
	@Column
	private String email;

	
	public Long getStuffId() {
		return stuffId;
	}

	public void setStuffId(Long stuffId) {
		this.stuffId = stuffId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
