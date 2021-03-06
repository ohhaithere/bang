package com.bang.service;

import com.bang.model.User;


/**
 * Created by johnnyGrimes on 22/02/2018.
 */
public interface UserService {
    User save(User user);
    User get(long id);
    Iterable<User> list();
    void update(User user);
    void delete(long id);
    User getByCellphone(String cellphone);
}
