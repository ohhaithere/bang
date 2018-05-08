package com.bang.sms.service.impl;

import com.bang.sms.model.Sms;
import com.bang.sms.repository.SmsRepository;
import com.bang.sms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService{

    @Autowired
    private SmsRepository smsRepository;


    @Override
    public Sms createSms(Sms sms) {
        return smsRepository.save(sms);
    }

    @Override
    public Sms getSms(Long id) {
        return smsRepository.findOne(id);
    }

    @Override
    public void deleteSms(Long id) {
        smsRepository.delete(id);
    }

    @Override
    public Sms getByPhoneAndCode(String phone, Integer code) {
        return smsRepository.findSmsByPhoneAndCode(phone, code);
    }

    @Override
    public Sms updateSms(Sms sms) {
        return smsRepository.save(sms);
    }
}
