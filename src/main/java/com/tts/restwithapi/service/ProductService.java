package com.tts.restwithapi.service;

import java.util.List;
import com.tts.restwithapi.model.Product;
import com.tts.restwithapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements SProductService{
	@Autowired
    private ProductRepository repository;

    @Override
    public List<Product> findAll() {

        List<Product> cities = (List<Product>) repository.findAll();
        
        return cities;
    }

    @Override
    public Product findById(Long id) {

    	Product city = repository.findOne(id);
        return city;
    }
}
