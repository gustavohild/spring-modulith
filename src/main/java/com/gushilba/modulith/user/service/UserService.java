package com.gushilba.modulith.user.service;

import com.gushilba.modulith.user.dto.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponse getUser(long id) {
        return new UserResponse(id, "Nome do User");
    }

}
