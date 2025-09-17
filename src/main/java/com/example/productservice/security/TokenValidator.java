package com.example.productservice.security;



import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
public class TokenValidator {

    private RestTemplate restTemplate;

   public TokenValidator(RestTemplate restTemplate){
       this.restTemplate = restTemplate;

   }

    public  UserDto validateToken(String token) {
        // Send an HTTP POST request to the UserService for token validation
        ResponseEntity<UserDto> userDtoResponse = restTemplate.postForEntity(
                "http://localhost:8080/auth/validate/" + token,
                null, // No body needed for validation
                UserDto.class // Expecting a UserDto object as a response
        );

        // If no user is found, return null, which implies invalid token
        if (userDtoResponse.getBody() == null) {
            return null;
        }

        // If validation is successful, return the UserDto
        return userDtoResponse.getBody();
    }


}
