package com.core.service;

import com.core.model.UserModel;

import java.util.List;
import java.util.UUID;

public interface UserService {
    UserModel save(String fullName, String email, String password);
    List<UserModel> getAllUsers();
    UserModel getByEmail(String email);
    List<UserModel> getUsersByEmail(String email);
}
