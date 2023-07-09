package com.ECOMMERCE.MYSQLECOMMERCE.Service;

import com.ECOMMERCE.MYSQLECOMMERCE.Model.Product;
import com.ECOMMERCE.MYSQLECOMMERCE.Repository.IproductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    IproductRepo  iproductRepo;
    public void addproduct(Product product) {
        iproductRepo.save(product);
    }

    public List<Product> getallProducts() {
      return iproductRepo.findAll();
    }

    public List<Product> getproductsbycategory(String category) {
        return iproductRepo.findByproductCategory(category);
    }

    public void deletebyid(Integer id) {
        iproductRepo.deleteById(id);
    }
}
