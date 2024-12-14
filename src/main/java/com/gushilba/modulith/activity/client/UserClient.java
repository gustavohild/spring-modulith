package com.gushilba.modulith.activity.client;

import com.gushilba.modulith.user.controller.UserController;
import com.gushilba.modulith.user.dto.UserResponse;
import org.springframework.stereotype.Component;

@Component
public class UserClient {

    private final UserController userController;

    public UserClient(UserController userController) {
        this.userController = userController;
    }

    public UserResponse getUser(long userId) {
        return userController.getUserById(userId, null).getBody();
    }

}
