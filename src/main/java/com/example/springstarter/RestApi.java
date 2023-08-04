package com.example.springstarter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/fakeApi")


// // api = https://jsonplaceholder.typicode.com/photos

// public class RestApi {
//   RestTemplate restTemplate = new RestTemplate();
//   String apiUrl = "https://jsonplaceholder.typicode.com/photos";
//   String response = restTemplate.getForObject(apiUrl, String.class);

//   ObjectMapper mapper = new ObjectMapper();
//   MyDataObject data = mapper.readValue(response, MyDataObject.class);

//   ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
//   if (responseEntity.getStatusCode() == HttpStatus.OK) {
//     return data;
//   } else {
//     // handle error
//     return 0;
//   }

// }

// @RestController
// @RequestMapping("/fakeApi")
// public class RestApi {

//     private final RestTemplate restTemplate = new RestTemplate();

//     @GetMapping("/photos")
//     public ResponseEntity<?> getPhotos() {
//         String apiUrl = "https://jsonplaceholder.typicode.com/photos";
//         ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
//         if (responseEntity.getStatusCode() == HttpStatus.OK) {
//             String response = responseEntity.getBody();
//             try {
//                 ObjectMapper mapper = new ObjectMapper();
//                 MyDataObject[] data = mapper.readValue(response, MyDataObject[].class);
//                 return ResponseEntity.ok(data);
//             } catch (JsonProcessingException e) {
//                 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error parsing response");
//             }
//         } else {
//             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error calling external API");
//         }
//     }
// }
