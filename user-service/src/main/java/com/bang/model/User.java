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
    private Long id;
    private String name;
    private String email;
    private Date dateOfBirth;
    private String sex;
    private String role;
    private String country;
    private String city;
    private String photoHref;
    private String aboutText;
    private String cellphone;
    private Integer desiredReward;
    private String userLink;

}
