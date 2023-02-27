package com.example.ShoppingMall.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

//레파지토리랑 객체랑은 세트
public interface UserRepository extends JpaRepository<User, Long> {
}
