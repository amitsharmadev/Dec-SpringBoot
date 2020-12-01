package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.Product;
import com.example.demo.domain.ProductRepo;

@Controller
public class ProductController {

	@Autowired
	ProductRepo pRepo;
	
	@RequestMapping(path = "/product",method = RequestMethod.POST)
	public String saveProdut(@ModelAttribute("product") Product prod)
	{
		pRepo.save(prod);
		return "prod";
	}
	
	@RequestMapping("/")
	public String callProdut(Model model)
	{
		Product p=new Product();
		model.addAttribute("product",p);
		return "wel";
	}
	
}
