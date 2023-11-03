package com.core.service.impl;

import com.core.Dao.UserDao;
import com.core.model.UserModel;
import com.core.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserModel save(String fullName, String email, String password) {
        return userDao.save(fullName, email, password);
    }
    @Override
    public List<UserModel> getAllUsers() {
        return userDao.getAll();
    }
    @Override
    public UserModel getByEmail(String email) {
        return userDao.getByEmail(email);
    }
    @Override
    public List<UserModel> getUsersByEmail(String email){
        return userDao.getUsersByEmail(email);
    }
}
