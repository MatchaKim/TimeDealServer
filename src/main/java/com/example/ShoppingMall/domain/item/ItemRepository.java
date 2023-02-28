package com.example.ShoppingMall.domain.item;

import com.example.ShoppingMall.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long>  {

}
