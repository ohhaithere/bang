package com.bang.sms.service;

import com.bang.sms.model.Sms;
import org.springframework.stereotype.Service;

@Service
public interface SmsService {

    Sms createSms(Sms sms);

    Sms getSms(Long id);

    void deleteSms(Long id);

}
