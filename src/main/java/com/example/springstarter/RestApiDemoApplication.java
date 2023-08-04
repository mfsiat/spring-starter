package com.example.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestApiDemoApplication {

   public static void main(String[] args) {
      SpringApplication.run(RestApiDemoApplication.class, args);
      fetchAndPrintPosts();
   }

   public static void fetchAndPrintPosts() {
      RestTemplate restTemplate = new RestTemplate();
      String apiUrl = "https://jsonplaceholder.typicode.com/posts";
      try {
         Post[] posts = restTemplate.getForObject(apiUrl, Post[].class);

         if (posts != null) {
            for (Post post : posts) {
               System.out.println(post);
            }
         } else {
            System.out.println("No posts found.");
         }
      } catch (Exception e) {
         System.err.println("Error fetching posts: " + e.getMessage());
      }
   }
}

class Post {
   private int id;
   private String title;
   private String body;

   // Constructor, getter and setter methods

   @Override
   public String toString() {
      return "Post{" +
              "id=" + id +
              ", title='" + title + '\'' +
              ", body='" + body + '\'' +
              '}';
   }
}
