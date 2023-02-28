package com.example.ShoppingMall.service.item;

import com.example.ShoppingMall.domain.item.Item;
import com.example.ShoppingMall.domain.item.ItemRepository;
import com.example.ShoppingMall.domain.user.User;
import com.example.ShoppingMall.domain.user.UserRepository;
import com.example.ShoppingMall.dto.item.request.ItemCreateRequest;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final ItemRepository itemRepository; //레파지토리 가져옴

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    public void saveItem(ItemCreateRequest request){
        itemRepository.save(new Item(request.getItemname(),
                        request.getPrice(),
                        request.getDetail(),
                        request.getHours(),
                        request.getMinutes(),
                        request.getStock()));
    }
}
