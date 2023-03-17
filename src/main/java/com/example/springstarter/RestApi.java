package com.example.springstarter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fakeApi")


// api = https://jsonplaceholder.typicode.com/photos

public class RestApi {
  RestTemplate restTemplate = new RestTemplate();
  String apiUrl = "https://jsonplaceholder.typicode.com/photos";
  String response = restTemplate.getForObject(apiUrl, String.class);

  ObjectMapper mapper = new ObjectMapper();
  MyDataObject data = mapper.readValue(response, MyDataObject.class);

  ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
  if (responseEntity.getStatusCode() == HttpStatus.OK) {
    return data;
  } else {
    // handle error
    return 0;
  }

}