package com.example.ShoppingListServer.service;

import com.example.ShoppingListServer.model.ShoppingCalculatorResponse;
import com.example.ShoppingListServer.model.ShoppingList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ShoppingListServerService
{
    private final RestTemplate restTemplate;

    public double insertShoppingList(ShoppingList shoppingList)
    {
        HttpEntity<ShoppingList> httpEntity = new HttpEntity<>(shoppingList);
        ShoppingCalculatorResponse shoppingCalculatorResponse;

        try {
            shoppingCalculatorResponse = restTemplate.exchange("http://localhost:8081/api/v1/shoppingListCalculator/calculateListTotal",
                    HttpMethod.POST, httpEntity, ShoppingCalculatorResponse.class).getBody();
            return shoppingCalculatorResponse.getTotalPrice();
        } catch (RestClientException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}