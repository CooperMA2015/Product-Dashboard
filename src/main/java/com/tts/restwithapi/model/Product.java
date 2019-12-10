package com.tts.restwithapi.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int quantity;
    private double weight;
    private String type;

    public Product() {
    }

    public Product(Long id, String name, int quantity, double weight, String type) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", name=" + name + ", quantity=" + quantity +
        		", weight=" + weight + ", type=" + type + '}';
    }
}
