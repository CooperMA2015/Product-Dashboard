package com.tts.restwithapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.restwithapi.model.Product;
import com.tts.restwithapi.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/product")
	public List<Product> get(){
		return productService.get();
	}
	
	@PostMapping("/product")
	public Product save(@RequestBody Product productObj) {
		productService.save(productObj);
		return productObj;
	}
	
	@GetMapping("/product/{id}")
	public Product get(@PathVariable int id) {
		Product productObj = productService.get(id);
		if(productObj == null) {
			throw new RuntimeException("Product with id " + id + " is not found");
		}
		return productObj;
	}
	
	@DeleteMapping("/product/{id}")
	public String delete(@PathVariable int id) {
		productService.delete(id);
		return "Product has been deleted with id: " + id;
	}
	
	@PutMapping("/product")
	public Product update(@RequestBody Product productObj) {
		productService.save(productObj);
		return productObj;
	}
}
