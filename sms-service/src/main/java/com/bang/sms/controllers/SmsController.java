package com.bang.sms.controllers;

import com.bang.sms.model.Sms;
import com.bang.sms.service.SmsService;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


@Controller
@RequestMapping(path="/api/v1/sms")
public class SmsController {

    @Autowired
    SmsService smsService;

    public static final String ACCOUNT_SID = "AC404b3484b05cb2ef8e508428a7885b71";
    public static final String AUTH_TOKEN = "7d9c55542e0cce9aca5ae861ce3d38e1";

    @GetMapping("/send/{phoneNumber}")
    public @ResponseBody Sms sendSms(@PathVariable String phoneNumber) throws TwilioRestException {

        Sms sms = new Sms();
        sms.setPhone(phoneNumber);
        sms.setCode(ThreadLocalRandom.current().nextInt(1000, 10001));

        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("Body", sms.getCode().toString()));
        params.add(new BasicNameValuePair("To", phoneNumber)); //Add real number here
        params.add(new BasicNameValuePair("From", "+12133221714"));

        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
        MessageFactory messageFactory = client.getAccount().getMessageFactory();
        messageFactory.create(params);
        smsService.createSms(sms);

        return sms;
    }

    @GetMapping("/check/{phone}/{code}")
    public @ResponseBody String checkSmsCode(@PathVariable String phone, @PathVariable Integer code){
        Sms sms = smsService.getByPhoneAndCode(phone, code);

        if(sms != null) {
            sms.setActivated(true);
            smsService.updateSms(sms);
            return "true";
        }
        else
            return "false";
    }

}
