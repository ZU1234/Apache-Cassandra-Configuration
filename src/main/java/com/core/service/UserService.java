package com.core.service;

import com.core.model.UserModel;

import java.util.List;
import java.util.UUID;

public interface UserService {

    // Kullanıcı eklemek için
    UserModel save(String fullName, String email, String password);

    // Kullanıcıları sorgulamak için
    List<UserModel> getAllUsers();

    // ID'ye göre kullanıcıyı sorgulamak için
    UserModel getUserById(UUID pk);

    // Kullanıcıyı güncellemek için
    void updateUser(UserModel userModel);

    // Kullanıcıyı silmek için
    void deleteUser(UUID pk);
}
