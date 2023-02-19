package com.example.SpringMysqlDockerCompose.Controller;

import com.example.SpringMysqlDockerCompose.Entity.Product;
import com.example.SpringMysqlDockerCompose.Repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/getProductList")
    public List<Product> getProductList(){

        log.info("Calling getProductList");
        List<Product> productList = productRepository.findAll();
        log.info("productList: {}", productList);
        return productList;
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){

        log.info("Calling addProduct, product: {}", product);
        product = productRepository.save(product);
        log.info("product: {}", product);
        return product;
    }
}
