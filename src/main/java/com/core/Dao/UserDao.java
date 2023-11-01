package com.core.Dao;

import com.core.model.UserModel;

import java.util.List;

public interface UserDao{
    UserModel save(String fullName, String email,String password);
    UserModel findByPk(String pk);
    UserModel findByUid(String uid);
    List<UserModel> getAll();
    List<UserModel> remove(String pk);
}
