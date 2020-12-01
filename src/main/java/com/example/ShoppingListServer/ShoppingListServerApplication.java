package com.example.ShoppingListServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ShoppingListServerApplication
{
	@Bean
	public RestTemplate getRestTemplate() { return new RestTemplate(); }

	public static void main(String[] args) {
		SpringApplication.run(ShoppingListServerApplication.class, args);
	}
}