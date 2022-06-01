package com.sample.mongodb.controller;

import com.sample.mongodb.entity.CustomerEntity;
import com.sample.mongodb.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/customer")
    public String save(@RequestBody CustomerEntity customer){
        service.save(customer);
        return "Added Successfully";
    }

    @GetMapping("/customer")
    public List<CustomerEntity> list() {
        return service.list();
    }

    @GetMapping("/customer/{id}")
    public Optional<CustomerEntity> get(@PathVariable String id) {
        return service.get(id);
    }

    @DeleteMapping("/customer/{id}")
    public String delete(@PathVariable String id){
        service.delete(id);

        return "Deleted Successfully";
    }
}
