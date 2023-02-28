package com.example.ShoppingMall.controller.user;

import com.example.ShoppingMall.dto.user.request.UserCreateRequest;
import com.example.ShoppingMall.dto.user.response.UserResponse;
import com.example.ShoppingMall.service.user.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }//생성자 만들기

    @PostMapping("/user") // POST /user
    public void saveUser(@RequestBody UserCreateRequest request) {

        userService.saveUser(request);
    }


    @GetMapping("/user")//모든 회원목록을 받아옵니다.
    public List<UserResponse> getUsers(){
        return userService.getUsers();
    }



}
