package com.example.ShoppingMall.controller.item;

import com.example.ShoppingMall.dto.item.request.ItemCreateRequest;
import com.example.ShoppingMall.dto.user.request.UserCreateRequest;
import com.example.ShoppingMall.service.item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemCreateController {


    private final ItemService itemService;


    public ItemCreateController(ItemService itemService) {
        this.itemService = itemService;
    }


    @PostMapping("/item") //
    public void saveItem(@RequestBody ItemCreateRequest request) {

        itemService.saveItem(request);
    }
}
