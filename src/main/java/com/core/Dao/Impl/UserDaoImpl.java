package com.core.Dao.Impl;

import com.core.Dao.UserDao;
import com.core.model.UserModel;
import com.core.repository.UserModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserDaoImpl implements UserDao {
private UserModelRepository userModelRepository;
@Autowired
    public UserDaoImpl(UserModelRepository userModelRepository) {
        this.userModelRepository = userModelRepository;
    }
    @Override
    public UserModel save(String fullName, String email, String password) {
        UserModel user=new UserModel();
        user.setPk(UUID.randomUUID());
        user.setFullname(fullName);
        user.setEmail(email);
        user.setPassword(password);
        System.out.printf(String.valueOf(userModelRepository.save(user)));
        return userModelRepository.save(user);
    }

    @Override
    public UserModel findByPk(String pk) {
        return null;
    }

    @Override
    public UserModel findByUid(String uid) {
        return null;
    }

    @Override
    public List<UserModel> getAll() {
        return (List<UserModel>) userModelRepository.findAll();
    }

    @Override
    public List<UserModel> remove(String pk) {
        return null;
    }
}
