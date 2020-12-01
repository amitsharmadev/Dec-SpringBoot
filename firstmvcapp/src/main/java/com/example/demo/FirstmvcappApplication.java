package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Product;
import com.example.demo.domain.ProductRepo;

@SpringBootApplication
public class FirstmvcappApplication implements CommandLineRunner {

	@Autowired
	ProductRepo prodRepo;
	public static void main(String[] args) {
		SpringApplication.run(FirstmvcappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		prodRepo.save(new Product(101, "Printer", "Computer", 13000));
		prodRepo.save(new Product(102, "Scanner", "Computer", 13000));
		prodRepo.save(new Product(103, "Mouse", "Computer", 1000));
		prodRepo.save(new Product(104, "Monitor", "Computer", 21000));
		
		
	}

}
