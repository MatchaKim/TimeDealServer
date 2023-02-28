package com.example.ShoppingMall.domain.user;

import com.example.ShoppingMall.domain.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//레파지토리랑 객체랑은 세트
public interface UserRepository extends JpaRepository<User, Long> {

    //Optional<User> findByName(String name);

}
