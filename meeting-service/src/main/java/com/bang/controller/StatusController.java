package com.bang.controller;

import com.bang.model.Status;
import com.bang.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api/v1/status")
public class StatusController {

    @Autowired
    StatusService statusService;


    @GetMapping
    public @ResponseBody Iterable<Status> getStatuses(){
        return statusService.getAllStatuses();
    }

}
