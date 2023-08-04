package com.example.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStarterApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringStarterApplication.class, args);
		SpringApplication.run(RestApiDemoApplication.class, args);
    RestTemplate restTemplate = new RestTemplate();
    String apiUrl = "https://jsonplaceholder.typicode.com/posts";
    Post[] posts = restTemplate.getForObject(apiUrl, Post[].class);

    for (Post post : posts) {
      System.out.println(post);
   }
	}

}
