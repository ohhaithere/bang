package com.bang.service;

import com.bang.model.User;
import com.bang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by johnnyGrimes on 22/02/2018.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User get(long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public void update(long id, User user) {
        User user2 = userRepository.findOne(id);
        user2.setName(user.getName());
        user2.setEmail(user.getEmail());
        userRepository.save(user2);
    }

    @Override
    public void delete(long id) {
        userRepository.delete(id);
    }
}
