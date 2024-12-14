package com.gushilba.modulith.activity.controller;

import com.gushilba.modulith.activity.dto.request.ActivityRequest;
import com.gushilba.modulith.activity.dto.response.ActivityResponse;
import com.gushilba.modulith.activity.service.ActivityService;
import com.gushilba.modulith.user.controller.UserController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    private final UserController userController;
    private final ActivityService activityService;

    public ActivityController(UserController userController, ActivityService activityService) {
        this.userController = userController;
        this.activityService = activityService;
    }

    @PostMapping
    ResponseEntity<ActivityResponse> createActivity(@RequestBody ActivityRequest activityRequest) throws Exception {
        activityService.validateUser(activityRequest.userId());
        var result = activityService.createActivity(activityRequest);
        return ResponseEntity.ok(result);
    }

}
