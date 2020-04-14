package com.souravrestaurant.restaurantspringbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souravrestaurant.restaurantspringbootapp.model.RestaurantStuff;
import com.souravrestaurant.restaurantspringbootapp.repository.StuffRepository;

@Service
public class StuffService {
	@Autowired
	private StuffRepository stuffRepository;
	public void saveOrUpdate(RestaurantStuff restaurantStuff) {
		stuffRepository.save(restaurantStuff);
	}
}
