package com.SpringProj.MyProject.Services;

import com.SpringProj.MyProject.Controllers.ProductController;
import com.SpringProj.MyProject.Repositories.ProductRepo;
import com.SpringProj.MyProject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
        @Autowired
        private ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    //Get Product by Id
    public Product getProductById(int id){
        return repo.findById(id).orElse(null);
    }

    //Add Product
    public void addProduct(Product prod){
        repo.save(prod);
    }

    //Update Product
    public void updateProduct(Product prod){
        repo.save(prod);
    }

    //delete Product
    public void deleteProduct(int id){
       repo.deleteById(id);
    }
}
