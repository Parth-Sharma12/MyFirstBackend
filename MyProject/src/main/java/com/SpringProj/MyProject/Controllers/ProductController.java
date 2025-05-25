package com.SpringProj.MyProject.Controllers;

import com.SpringProj.MyProject.Services.ProductService;
import com.SpringProj.MyProject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    //Get all the products
    @RequestMapping("/get-products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    //Get a product by Id
    @RequestMapping("/get-product/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    //Add a new product
    @PostMapping("/add-products")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    //Update a product info by Id
    @PutMapping("/update-product")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    //Delete an entry by Id
    @DeleteMapping("/delete-product/{id}")
    public void deleteProduct(@PathVariable int id){
        service.deleteProduct(id);
    }

}
