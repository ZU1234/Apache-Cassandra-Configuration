package com.core.Dao.Impl;

import com.core.Dao.UserDao;
import com.core.model.UserModel;
import com.core.repository.UserModelRepository;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.query.Criteria;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoImpl implements UserDao {
    private final UserModelRepository userModelRepository;
    private final CassandraTemplate cassandraTemplate;
    private final CassandraOperations cassandraOperations;

    public UserDaoImpl(UserModelRepository userModelRepository, CassandraTemplate cassandraTemplate, CassandraOperations cassandraOperations) {
        this.userModelRepository = userModelRepository;
        this.cassandraTemplate = cassandraTemplate;
        this.cassandraOperations = cassandraOperations;
    }

    @Override
    public UserModel save(String fullName, String email, String password) {
        UserModel user = new UserModel();
        user.setFullname(fullName);
        user.setEmail(email);
        user.setPassword(password);
        return cassandraOperations.insert(user);
    }

    @Override
    public List<UserModel> getAll() {
        return (List<UserModel>) userModelRepository.findAll();
    }

    @Override
    public UserModel getByEmail(String email) {
        Query query = Query.query(Criteria.where("email").is(email));
        return cassandraTemplate.selectOne(query, UserModel.class);
    }

    @Override
    public List<UserModel> getUsersByEmail(String email) {
        Query query = Query.query(Criteria.where("email").is(email));
        return cassandraTemplate.select(query, UserModel.class);
    }
}
