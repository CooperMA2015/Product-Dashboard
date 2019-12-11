package com.tts.restwithapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tts.restwithapi.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Product> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("from Product", Product.class);
		List<Product> list = query.getResultList();
		return list;
	}

	@Override
	public Product get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Product productObj = currentSession.get(Product.class, id);
		return productObj;
	}

	@Override
	public void save(Product product) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(product);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Product productObj = currentSession.get(Product.class, id);
		currentSession.delete(productObj);
	}
	
}
