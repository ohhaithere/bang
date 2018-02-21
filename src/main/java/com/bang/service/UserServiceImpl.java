package com.bang.service;

import com.bang.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by johnnyGrimes on 22/02/2018.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Override
    public long save(User user) {
        return 0;
    }

    @Override
    public User get(long id) {
        return null;
    }

    @Override
    public List<User> list() {
        return null;
    }

    @Override
    public void update(long id, User user) {

    }

    @Override
    public void delete(long id) {

    }
}
