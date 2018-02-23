package com.bang.controllers;

import com.bang.model.User;
import com.bang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


/**
 * Created by johnnyGrimes on 23/02/2018.
 */
@Controller
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewUser(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam Date dateOfBirth,
            @RequestParam String sex,
            @RequestParam String role,
            @RequestParam String country,
            @RequestParam String city,
            @RequestParam String photoHref,
            @RequestParam String aboutText,
            @RequestParam String cellPhone,
            @RequestParam int pricePerHour
    ) {
        User n = new User();

        n.setName(name);
        n.setEmail(email);
        n.setDateOfBirth(dateOfBirth);
        n.setSex(sex);
        n.setRole(role);
        n.setCountry(country);
        n.setCity(city);
        n.setPhotoHref(photoHref);
        n.setAboutText(aboutText);
        n.setCellphone(cellPhone);
        n.setPricePerHour(pricePerHour);

        userRepository.save(n);

        return "Saved\n";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path="/delete")
    public @ResponseBody String deleteUser(
            @RequestParam  Long id
    ) {
        userRepository.delete(id);

        return "Deleted\n";
    }

}
