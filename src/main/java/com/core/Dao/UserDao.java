package com.core.Dao;

import com.core.model.UserModel;

import java.util.List;

public interface UserDao{
    UserModel save(String fullName, String email,String password);
    List<UserModel> getAll();
    UserModel getByEmail(String email);

    List<UserModel> getUsersByEmail(String email);
}
