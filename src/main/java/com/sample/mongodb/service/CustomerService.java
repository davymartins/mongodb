package com.sample.mongodb.service;

import com.sample.mongodb.entity.CustomerEntity;
import com.sample.mongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public CustomerEntity save(CustomerEntity customer){
        CustomerEntity saved = repository.save(customer);
        return saved;
    }

    public List<CustomerEntity> list() {
        return repository.findAll();
    }

    public Optional<CustomerEntity> get(String id) {
        return repository.findById(id);
    }

    public void delete(String id){
        repository.deleteById(id);
    }
}