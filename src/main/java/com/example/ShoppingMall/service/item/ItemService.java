package com.example.ShoppingMall.service.item;

import com.example.ShoppingMall.domain.item.Item;
import com.example.ShoppingMall.domain.item.ItemRepository;
import com.example.ShoppingMall.dto.item.request.ItemCreateRequest;
import com.example.ShoppingMall.dto.item.response.ItemResponse;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    private final ItemRepository itemRepository; //레파지토리 가져옴

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Transactional
    public void saveItem(ItemCreateRequest request){
        itemRepository.save(new Item(request.getItemname(),
                        request.getPrice(),
                        request.getDetail(),
                        request.getHours(),
                        request.getMinutes(),
                        request.getStock()));
    }

    @Transactional
    public List<ItemResponse> getItems(){
        return  itemRepository.findAll().stream()
                .map(item -> new ItemResponse(item.getItem_id(),
                        item.getItemname(),
                        item.getPrice(),
                        item.getDetail(),
                        item.getHours(),
                        item.getMinutes(),
                        item.getStock()))
                .collect(Collectors.toList());}
/*
    @Transactional
    public void deleteItem(String name) {
        Item item = itemRepository.findByName(name)
                .orElseThrow(IllegalArgumentException::new);

        itemRepository.delete(item);

    }
*/





}
