package com.example.ShoppingMall.dto.item.response;

import lombok.Data;

@Data
public class ItemResponse {

    private long item_id;

    private String itemname;
    private int price;
    private String detail;
    private int hours;
    private int minutes;
    private int stock;

    public ItemResponse(long item_id, String itemname, int price, String detail, int hours, int minutes, int stock) {
        this.item_id = item_id;
        this.itemname = itemname;
        this.price = price;
        this.detail = detail;
        this.hours = hours;
        this.minutes = minutes;
        this.stock = stock;
    }
}
