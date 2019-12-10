package com.tts.restwithapi.service;

import java.util.List;
import com.tts.restwithapi.model.Product;

public interface SProductService {
	
	public List<Product> findAll();
    public Product findById(Long id);
}

