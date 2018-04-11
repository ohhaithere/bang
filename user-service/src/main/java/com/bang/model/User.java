package com.bang.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by johnnyGrimes on 22/02/2018.
 */
@Entity(name = "User")
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

    public User(
            String name,
            String email,
            Date dateOfBirth,
            String sex,
            String role,
            String country,
            String city,
            String photoHref,
            String aboutText,
            String cellphone,
            Integer desiredReward
    ) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.role = role;
        this.country = country;
        this.city = city;
        this.photoHref = photoHref;
        this.aboutText = aboutText;
        this.cellphone = cellphone;
        this.desiredReward = desiredReward;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhotoHref() {
        return photoHref;
    }

    public void setPhotoHref(String photoHref) {
        this.photoHref = photoHref;
    }

    public String getAboutText() {
        return aboutText;
    }

    public void setAboutText(String aboutText) {
        this.aboutText = aboutText;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public Integer getDesiredReward() {
        return desiredReward;
    }

    public void setDesiredReward(Integer desiredReward) {
        this.desiredReward = desiredReward;
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserLink() {
        return userLink;
    }

    public void setUserLink(String userLink) {
        this.userLink = userLink;
    }
}
