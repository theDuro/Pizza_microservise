package pl.edu.pwsztar.apiconection.dto.Order.dto;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

public class HttpExample {

    public static void main(String[] args) {
        String url = "http://localhost:8080/getBill";
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON_UTF8));
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        List<Integer> indexList = Arrays.asList(1, 2, 3, 4, 5);
        HttpEntity<List<Integer>> request = new HttpEntity<>(indexList, headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
        System.out.println("Response status: " + response.getStatusCode());
        System.out.println("Response body: " + response.getBody());
    }

}




