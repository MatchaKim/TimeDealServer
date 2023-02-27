package com.example.ShoppingMall.service.user;

import com.example.ShoppingMall.domain.user.User;
import com.example.ShoppingMall.domain.user.UserRepository;
import com.example.ShoppingMall.dto.user.request.UserCreateRequest;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    private final UserRepository userRepository; //레파지토리 가져옴

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(UserCreateRequest request){
       userRepository.save(new User(request.getName(),request.getPassword()));
    }
}
