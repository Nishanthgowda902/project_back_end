package com.fsd2425.projectback.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.fsd2425.projectback.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
