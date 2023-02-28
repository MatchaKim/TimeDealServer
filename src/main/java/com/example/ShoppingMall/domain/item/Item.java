package com.example.ShoppingMall.domain.item;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//밑에 프로텍티드랑 호환가능(언제 사용하는건지 공부 할것)
@Entity //entitiy 이용시 primarykey 필수
public class Item {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long item_id;

        @Column(length = 32, name = "itemname")
        private String  itemname;

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

        public Item(String itemname, int price, String detail, int hours, int minutes, int stock) {

            this.itemname = itemname;
            this.price = price;
            this.detail = detail;
            this.hours = hours;
            this.minutes = minutes;
            this.stock = stock;
        }//생성자에서는 id autoincrement 는 제외해주기

        protected Item(){}//필수



}


