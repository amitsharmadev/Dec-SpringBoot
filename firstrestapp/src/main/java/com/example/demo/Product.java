package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@Entity
@XmlRootElement
public class Product {

	@Id
	int productCode;
	String productName;
	String category;
	int price;
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int productCode, String productName, String category, int price) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}
	public Product() {
		super();
	}
	
	
}
