package com.sample.mongodb.repository;

import com.sample.mongodb.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

@SuppressWarnings("unused")
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {}