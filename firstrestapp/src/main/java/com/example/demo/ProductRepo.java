package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
	
public interface ProductRepo  extends JpaRepository<Product, Integer>{

}
