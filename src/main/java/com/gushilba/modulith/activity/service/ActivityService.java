package com.gushilba.modulith.activity.service;

import com.gushilba.modulith.activity.client.UserClient;
import com.gushilba.modulith.activity.dto.request.ActivityRequest;
import com.gushilba.modulith.activity.dto.response.ActivityResponse;
import com.gushilba.modulith.user.controller.UserController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

    private final UserClient userClient;

    public ActivityService(UserClient userClient) {
        this.userClient = userClient;
    }

    public ActivityResponse createActivity(ActivityRequest activityRequest) {
        return new ActivityResponse(1L, "SUPORTE", "Suporte ao cliente");
    }

    public void validateUser(long userId) throws Exception {
        /*
        A chamada aqui é feita através do método Controller para simular uma chamada de API. Dessa forma já construímos
        o request corretamente e o response tbm ja é mapeado corretamente
        */
        var response = userClient.getUser(userId);
    }

}
