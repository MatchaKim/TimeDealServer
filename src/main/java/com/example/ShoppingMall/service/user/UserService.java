package com.example.ShoppingMall.service.user;

import com.example.ShoppingMall.domain.user.User;
import com.example.ShoppingMall.domain.user.UserRepository;
import com.example.ShoppingMall.dto.user.request.UserCreateRequest;
import com.example.ShoppingMall.dto.user.response.UserResponse;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {


    private final UserRepository userRepository; //레파지토리 가져옴

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    @Transactional
    public void saveUser(UserCreateRequest request){
       userRepository.save(new User(request.getName(),request.getPassword()));
    }


    @Transactional
    public List<UserResponse> getUsers(){
        return  userRepository.findAll().stream()
                .map(user -> new UserResponse(user.getUser_id(),user.getName(),user.getPassword()))
                .collect(Collectors.toList());
        //find all ->select from user

        /*스트림 기본 사용법
@DisplayName("이름만 가져와서 List 만들기")
void mapTest1() {
    List<String> humanNames = humans.stream()
            .map(h -> h.getName())
            .collect(Collectors.toList());}*/
    }










}
