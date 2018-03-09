package com.bang.sms.repository;

import com.bang.sms.model.Sms;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsRepository extends CrudRepository<Sms, Long> {

    @Query("FROM Sms s where s.phone = :phone AND s.code = :code AND s.activated = 'false'")
    Sms findSmsByPhoneAndCode(@Param("phone") String phone, @Param("code") Integer code);

}
