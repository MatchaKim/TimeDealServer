package com.example.ShoppingMall.dto.user.response;

import lombok.Data;

@Data
public class UserResponse {

        private long user_id;
        private String name;
        private String password;

        public UserResponse(long user_id, String name, String password) {
                this.user_id = user_id;
                this.name = name;
                this.password = password;
        }
        //@Data 는 생성자에는 해당이 없다

}
