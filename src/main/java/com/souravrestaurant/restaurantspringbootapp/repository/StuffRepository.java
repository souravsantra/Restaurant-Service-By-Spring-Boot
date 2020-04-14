package com.souravrestaurant.restaurantspringbootapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.souravrestaurant.restaurantspringbootapp.model.RestaurantStuff;

public interface StuffRepository extends CrudRepository<RestaurantStuff, Long> {

}
