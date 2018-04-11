package com.bang.controllers;

import com.bang.model.User;
import com.bang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/api/v1/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    User createUser(@RequestBody User user) {
        User newUser = userService.save(user);
        return newUser;
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Iterable<User> getAllUsers() {
        return userService.list();
    }

    @RequestMapping("/{id}")
    public @ResponseBody User getUserById(@PathVariable Long id) {
        return userService.get(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public @ResponseBody String deleteUser(
            @RequestParam  Long id) {
        userService.delete(id);

        return "Deleted\n";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody User updateUser(@RequestBody User user) {
        User updatedUser = userService.save(user);

        return updatedUser;
    }

    @GetMapping("/auth/{cellphone}")
    public @ResponseBody User getUserByCellphone(@PathVariable String cellphone){
        return userService.getByCellphone(cellphone);
    }

   /* @PutMapping("/uploadPhoto/{id}")
    public User uploadUserPhoto((@RequestParam("file") MultipartFile file){

    }*/

}
