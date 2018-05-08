package com.bang.sms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Sms {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String phone;
    Integer code;
    Boolean activated;

}
