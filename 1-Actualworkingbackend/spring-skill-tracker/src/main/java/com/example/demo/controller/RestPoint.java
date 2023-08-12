package com.example.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;;

@SuppressWarnings("deprecation")
@Component
public class RestPoint extends WebMvcConfigurerAdapter
{
	@Override
	public void addCorsMappings(CorsRegistry registry) 
	{
		registry.addMapping("/**").allowedMethods("*").allowedOrigins("*");
		
	}
}
