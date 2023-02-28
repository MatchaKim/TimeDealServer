package com.example.ShoppingMall.domain.item;

import com.example.ShoppingMall.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long>  {


}

