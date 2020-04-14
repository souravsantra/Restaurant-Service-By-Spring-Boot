package com.souravrestaurant.restaurantspringbootapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souravrestaurant.restaurantspringbootapp.model.Meals;
import com.souravrestaurant.restaurantspringbootapp.repository.MealsRepository;

@Service
public class MealsService {
	@Autowired
	private MealsRepository mealsRepository;

	public void saveOrUpdate(Meals meals) {
		mealsRepository.save(meals);
	}
	
	public List<Meals> getAllMeals()   
	{  
	List<Meals> meals = new ArrayList<Meals>();  
	mealsRepository.findAll().forEach(meal -> meals.add(meal));  
	return meals;  
	}

}
