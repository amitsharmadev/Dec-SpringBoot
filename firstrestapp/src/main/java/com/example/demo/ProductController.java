package com.example.demo;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

	@Autowired
	ProductRepo pRepo;
	
	@GetMapping(path = "/products",produces = {"application/xml","application/json"})
	public Products getProducts(){
		Products p=new Products();
		p.setProduct(pRepo.findAll());
		return p;
	}
	@GetMapping(path = "/product/{id}",produces = {"application/xml","application/json"})
	public Product getProduct(@PathVariable int id){
		return pRepo.findById(id).get();
	}
	
	
	
	
}
