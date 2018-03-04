package com.bang.sms.repository;

import com.bang.sms.model.Sms;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsRepository extends CrudRepository<Sms, Long> {
}
