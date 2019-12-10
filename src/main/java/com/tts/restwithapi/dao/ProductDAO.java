package com.tts.restwithapi.dao;

import java.util.List;

import com.tts.restwithapi.model.Product;

public interface ProductDAO {
	
	List<Product> get();
	
	Product get(int id);
	
	void save(Product product);
	
	void delete(int id);

}
