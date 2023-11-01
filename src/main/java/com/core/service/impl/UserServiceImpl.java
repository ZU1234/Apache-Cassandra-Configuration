package com.core.service.impl;

import com.core.Dao.UserDao;
import com.core.model.UserModel;
import com.core.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserModel save(String fullName, String email, String password) {
        userDao.save(fullName, email, password);
        return null;
    }

    @Override
    public List<UserModel> getAllUsers() {
        return userDao.getAll();
    }

    @Override
    public UserModel getUserById(UUID pk) {
        return null;
    }

    @Override
    public void updateUser(UserModel userModel) {

    }

    @Override
    public void deleteUser(UUID pk) {

    }
}
