package com.core.repository;

import com.core.model.UserModel;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.UUID;
@Repository
public interface UserModelRepository extends CrudRepository<UserModel, Serializable> {
}
