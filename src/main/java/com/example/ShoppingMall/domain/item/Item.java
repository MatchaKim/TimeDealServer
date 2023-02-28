package com.example.ShoppingMall.domain.item;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity //entitiy 이용시 primarykey 필수
public class Item {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long item_id;

        @Column(length = 32, name = "itemname")
        private String  itemName;

        @Column( name ="price")
        private int  price;

        @Column(length = 255, name = "detail")
        private String  detail;

        @Column( name ="hours")
        private int  hours;

        @Column( name ="minutes")
        private int  minutes;

        @Column( name ="stock")
        private int  stock;

        public Item(String itemName, int price, String detail, int hours, int minutes, int stock) {

            this.itemName = itemName;
            this.price = price;
            this.detail = detail;
            this.hours = hours;
            this.minutes = minutes;
            this.stock = stock;
        }//생성자

        protected Item(){}//필수
}


