package com.tts.restwithapi.service;

import java.util.List;

import com.tts.restwithapi.model.Product;

public interface ProductService {
	
	List<Product> get();
	
	Product get(int id);
	
	void save(Product product);
	
	void delete(int id);
}
