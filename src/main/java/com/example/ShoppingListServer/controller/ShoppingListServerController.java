package com.example.ShoppingListServer.controller;

import com.example.ShoppingListServer.model.ShoppingList;
import com.example.ShoppingListServer.service.ShoppingListServerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/shoppingList")
public class ShoppingListServerController
{
    private final ShoppingListServerService shoppingListServerService;

    @PostMapping("/insertShoppingList")
    public double insertShoppingList(@RequestBody ShoppingList shoppingList)
    {
        return shoppingListServerService.insertShoppingList(shoppingList);
    }

}