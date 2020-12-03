package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.Employee;
import com.example.demo.repo.EmployeeRepo;

@SpringBootApplication
@RestController
public class ProdappApplication implements CommandLineRunner {

	@Autowired EmployeeRepo empRepo;
	public static void main(String[] args) {
		SpringApplication.run(ProdappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		empRepo.save(new Employee(301,"Arun Kaul",90900));
		empRepo.save(new Employee(302,"Vishal Aggarwal",90900));
		empRepo.save(new Employee(303,"Vikram Kapoor",90900));
		empRepo.save(new Employee(204,"Deepa Suneja",90900));
		empRepo.save(new Employee(205,"Nupur Kaul",90900));
		
	}

	@GetMapping("/demo")
	public String getData() {
		String data="This is the breakpoint data";
		return data;
	}
}
