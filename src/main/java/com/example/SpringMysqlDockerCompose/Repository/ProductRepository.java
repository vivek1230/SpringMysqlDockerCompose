package com.example.SpringMysqlDockerCompose.Repository;

import com.example.SpringMysqlDockerCompose.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
