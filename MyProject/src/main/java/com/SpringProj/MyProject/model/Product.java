package com.SpringProj.MyProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public Product() {
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
