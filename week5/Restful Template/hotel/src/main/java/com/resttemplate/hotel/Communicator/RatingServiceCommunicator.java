package com.resttemplate.hotel.Communicator;

import java.util.Map;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//define the rest Template
//RestTemplate builder 
//interact with rating service   getforEntity() method 
// requirement url, long.class ResponseEntity 
@Service
public class RatingServiceCommunicator {
    private final RestTemplate restTemplate;

    // @Autowired
    public RatingServiceCommunicator(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public long getRating(String id) {
        String Url = "http://localhost:8081/rating/id/";
        ResponseEntity<Long> response = restTemplate.getForEntity(Url+id, Long.class);
        

        return response.getBody();
    }

    public void addRating(Map<String,Long> ratingMap) {
       
        
        // restTemplate.postForEntity("http://localhost:8081/rating/add", ratingMap, Object.class);
        HttpEntity<Map<String, Long>> requesEntity = new HttpEntity<>(ratingMap);
        // restTemplate.postForEntity("http://localhost:8081/rating/add", requesEntity, Object.class);
        restTemplate.exchange("http://localhost:8081/rating/add", HttpMethod.POST, requesEntity, Long.class);
       
        
    }

    
}
