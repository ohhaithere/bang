package com.bang.service;

import com.bang.dao.UserDao;
import com.bang.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by johnnyGrimes on 22/02/2018.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public long save(User user) {
        return userDao.save(user);
    }

    @Override
    public User get(long id) {
        return userDao.get(id);
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }

    @Transactional
    @Override
    public void update(long id, User user) {
        userDao.update(id, user);
    }

    @Transactional
    @Override
    public void delete(long id) {
        userDao.delete(id);
    }
}
