package com.ECOMMERCE.MYSQLECOMMERCE.Controller;

import com.ECOMMERCE.MYSQLECOMMERCE.Model.Product;
import com.ECOMMERCE.MYSQLECOMMERCE.Service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public void addproduct(@RequestBody Product product){productService.addproduct(product);}

    @GetMapping("products")
    public List<Product> getAllproducts(){return productService.getallProducts();}

    @GetMapping(params = "Category")
    public List<Product> getbycategory(@RequestParam("Category")String Category){
    return  productService.getproductsbycategory(Category);
    }
    @DeleteMapping("product/{Id}")
    public void deletebyid (@PathVariable Integer Id){
        productService.deletebyid(Id);
    }
}
