package com.bang.sms.controllers;

import com.bang.sms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path="/api/v1/sms")
public class SmsController {

    @Autowired
    SmsService smsService;

    public static final String ACCOUNT_SID = "AC404b3484b05cb2ef8e508428a7885b71";
    public static final String AUTH_TOKEN = "7d9c55542e0cce9aca5ae861ce3d38e1";
    //public static final String TWILIO_NUMBER = "+15555555555";



}
