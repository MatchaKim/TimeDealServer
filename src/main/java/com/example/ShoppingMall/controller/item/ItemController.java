package com.example.ShoppingMall.controller.item;

import com.example.ShoppingMall.dto.item.request.ItemCreateRequest;
import com.example.ShoppingMall.dto.item.response.ItemResponse;
import com.example.ShoppingMall.service.item.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {


    private final ItemService itemService;


    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @PostMapping("/item") //
    public void saveItem(@RequestBody ItemCreateRequest request) {

        itemService.saveItem(request);
    }


    @GetMapping("/item") //모든 유저리스트 가져오기
    public List<ItemResponse> getItems(){
        return itemService.getItems();
    }

/*
    @DeleteMapping("/item")
    public void deleteItem(@RequestParam String itemname)
    {
        itemService.deleteItem(itemname);
    }

 */
}
