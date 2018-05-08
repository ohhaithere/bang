package com.bang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by johnnyGrimes on 22/02/2018.
 */
@Entity(name = "User")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String email;
    Date dateOfBirth;
    String sex;
    String role;
    String country;
    String city;
    String photoHref;
    String aboutText;
    String cellphone;
    Integer desiredReward;
    String userLink;

}
