package com.bang.controllers;

import com.bang.model.User;
import com.bang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping(path = "/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    private static String UPLOADED_FOLDER = "/";

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    User createUser(@RequestBody User user) {
        return userService.save(user);
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
        return userService.save(user);
    }

    @GetMapping("/auth/{cellphone}")
    public @ResponseBody User getUserByCellphone(@PathVariable String cellphone){
        return userService.getByCellphone(cellphone);
    }

    @PutMapping("/{id}/uploadPhoto/")
    public User uploadUserPhoto(@PathVariable Long id, @RequestParam("file") MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        User user = userService.get(id);
        Path path = Paths.get(UPLOADED_FOLDER + user.getId().toString());
        Files.write(path, bytes);


        user.setPhotoHref(path + file.getOriginalFilename());
        userService.save(user);
        return user;
    }

}
