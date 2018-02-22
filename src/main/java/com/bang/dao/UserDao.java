package com.bang.dao;

import com.bang.model.User;

import java.util.List;

/**
 * Created by johnnyGrimes on 22/02/2018.
 */
public interface UserDao {
    long save(User user);
    User get(long id);
    List<User> list();
    void update(long id, User user);
    void delete(long id);
}
