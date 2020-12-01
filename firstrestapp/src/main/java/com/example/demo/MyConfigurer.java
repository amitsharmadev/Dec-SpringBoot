package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class MyConfigurer extends WebMvcConfigurerAdapter {
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		// TODO Auto-generated method stub
		
		Map <String, MediaType> types=new HashMap<String, MediaType>();
		types.put("json", MediaType.APPLICATION_JSON);
		types.put("xml", MediaType.APPLICATION_XML);
		
		configurer.mediaTypes(types);
	}
}
