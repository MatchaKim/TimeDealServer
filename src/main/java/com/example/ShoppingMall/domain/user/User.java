package com.example.ShoppingMall.domain.user;

import lombok.Data;

import javax.persistence.*;
import java.util.IdentityHashMap;

@Data
@Entity //entitiy 이용시 primarykey 필수
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_id;

    @Column(length = 32, name = "name")
    private String  name;

    @Column(length = 32, name = "password")
    private String  password;

    public User(String name,String password){
        this.name=name;
        this.password=password;
    }//생성자
    protected User(){}//필수
}

