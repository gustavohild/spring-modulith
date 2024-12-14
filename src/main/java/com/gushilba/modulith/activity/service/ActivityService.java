package com.gushilba.modulith.activity.service;

import com.gushilba.modulith.activity.dto.request.ActivityRequest;
import com.gushilba.modulith.activity.dto.response.ActivityResponse;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

    public ActivityResponse createActivity(ActivityRequest activityRequest) {
        return new ActivityResponse(1L, "SUPORTE", "Suporte ao cliente");
    }

}
