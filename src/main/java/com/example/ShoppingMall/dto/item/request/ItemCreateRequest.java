package com.example.ShoppingMall.dto.item.request;


import lombok.Data;

@Data
public class ItemCreateRequest {
    private String itemname;
    private int price;
    private String detail;
    private int hours;
    private int minutes;
    private int stock;
}
