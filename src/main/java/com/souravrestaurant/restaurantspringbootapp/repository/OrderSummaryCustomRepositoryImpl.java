package com.souravrestaurant.restaurantspringbootapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.souravrestaurant.restaurantspringbootapp.model.OrderSummary;

@Repository
public class OrderSummaryCustomRepositoryImpl implements OrderSummaryCustomRepository  {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<OrderSummary> getOrderSummary(String date) {
		StoredProcedureQuery procedure =
	              em.createNamedStoredProcedureQuery("getOrderSummary")
	              .setParameter("IN_DATE", date);
	        return procedure.getResultList();
	}

	
}
