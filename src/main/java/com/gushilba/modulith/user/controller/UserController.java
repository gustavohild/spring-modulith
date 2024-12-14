package com.gushilba.modulith.user.controller;

import com.gushilba.modulith.user.dto.UserResponse;
import com.gushilba.modulith.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable long id,
                                                    @RequestParam(required = false) String name) {
        if (id != 1)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.ok(userService.getUser(id));
    }

}
