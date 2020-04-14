package com.souravrestaurant.restaurantspringbootapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.souravrestaurant.restaurantspringbootapp.model.Meals;
@Repository
public interface MealsRepository extends CrudRepository<Meals, Long> {
}
