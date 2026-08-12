package com.example.jsonplaceholder.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.example.jsonplaceholder.dto.*;

@Service
public class EventService {

    private final RestClient restClient;
    private Long id;

    public EventService(RestClient.Builder restClientBuilder, @Value("${jsonplaceholder.api.url}") String apiUrl) {
        this.restClient = restClientBuilder.baseUrl(apiUrl).build();
    }

    public UserResponseDTO getEvent(Long id) {
        return restClient.get()
                .uri("/users/" + id)
                .retrieve()
                .body(UserResponseDTO.class);

    }
}
